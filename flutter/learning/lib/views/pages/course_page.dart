import 'package:flutter/material.dart';
import 'package:learning/data/constants.dart';
import 'package:learning/views/pages/onboarding_page.dart';
import 'package:learning/widgets/container_widget.dart';
import 'package:learning/widgets/hero_widget.dart';

class CoursePage extends StatelessWidget {
  const CoursePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.symmetric(horizontal: 20.0),
      child: SingleChildScrollView(
        child: Column(children: [HeroWidget(title: "Course")]),
      ),
    );
  }
}
