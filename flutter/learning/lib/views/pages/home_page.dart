import 'package:flutter/material.dart';
import 'package:learning/widgets/container_widget.dart';
import 'package:learning/widgets/hero_widget.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.symmetric(horizontal: 20.0),
      child: SingleChildScrollView(
        child: Column(
          children: [
            HeroWidget(title: "Flutter App"),
            // you can use this to create a list of widgets
            // if you want to see how it looks like with the SingleChildScrollView
            ...List.generate(
              20,
              (index) => ContainerWidget(
                title: "Basic Layout",
                description: "This is a basic layout of a flutter app.",
              ),
            ),
                                
          ],
        ),
      ),
    );
  }
}
