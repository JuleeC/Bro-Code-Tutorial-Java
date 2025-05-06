import 'package:flutter/material.dart';
import 'package:learning/widgets/hero_widget.dart';

class CoursePage extends StatefulWidget {
  const CoursePage({super.key});

  @override
  State<CoursePage> createState() => _CoursePageState();
}

class _CoursePageState extends State<CoursePage> {
  
  @override
  void initState() {
    getData();
    super.initState();
  }

  void getData() {

  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Padding(
        padding: EdgeInsets.symmetric(horizontal: 20.0),
        child: SingleChildScrollView(
          child: Column(children: [HeroWidget(title: "Course")]),
        ),
      ),
    );
  }
}
