


import 'package:flutter/material.dart';
import 'package:learning/data/classes/acitivity_class.dart';
import 'package:learning/widgets/hero_widget.dart';
import 'dart:convert';
import 'package:http/http.dart' as http;

class CoursePage extends StatefulWidget {
  const CoursePage({super.key});

  @override
  State<CoursePage> createState() => _CoursePageState();
}

class _CoursePageState extends State<CoursePage> {
  late Activity activity;
  @override
  void initState() {
    getData();
    super.initState();
  }

  void getData() async {
    var url = Uri.https('bored-api.appbrewery.com', '/random');
    var response = await http.get(url);
    if( response.statusCode == 200) {
        activity = Activity.fromJson(jsonDecode(response.body) as Map<String, dynamic>);
        print(activity.activity);
        print(activity.type);
    } else {
      throw Exception('Failed to load album');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: FutureBuilder(future: getData(),builder:(context,AsyncSnapshot snapshot) {
        return Padding(
        padding: EdgeInsets.symmetric(horizontal: 20.0),
        child: SingleChildScrollView(
          child: Column(children: [HeroWidget(title: "Course")]),
        ),
      );

      },)  );
  }
}
