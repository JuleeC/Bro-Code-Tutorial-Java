import 'package:flutter/material.dart';
import 'package:learning/data/constants.dart';
import 'package:learning/views/pages/course_page.dart';
import 'package:learning/views/pages/onboarding_page.dart';
import 'package:learning/widgets/container_widget.dart';
import 'package:learning/widgets/hero_widget.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    List<String> list = [
      KValue.basicLayout,
      KValue.cleanUI,
      KValue.fixBugs,
      KValue.keyConcepts,
    ];
    return Padding(
      padding: EdgeInsets.symmetric(horizontal: 20.0),
      child: SingleChildScrollView(
        child: Column(
          children: [
            HeroWidget(title: "Flutter App", nextPage: CoursePage(),),
            // you can use this to create a list of widgets
            // if you want to see how it looks like with the SingleChildScrollView
            ...List.generate(
              list.length,
              (index) => ContainerWidget(
                title: list[index],
                description: "This is a basic layout of a flutter app.",
              ),
            ),
                                
          ],
        ),
      ),
    );
  }
}
