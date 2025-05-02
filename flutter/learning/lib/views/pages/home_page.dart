import 'package:flutter/material.dart';
import 'package:learning/data/constants.dart';
import 'package:learning/widgets/hero_widget.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.all(20.0),
      child: SingleChildScrollView(
        child: Column(
          children: [
            HeroWidget(title: "Flutter App"),
            Container(
              width: double.infinity,
              padding: EdgeInsets.symmetric(vertical: 10.0),
              child: Card(
                child: Padding(
                  padding: EdgeInsets.all(20.0),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text("Basic Layout", style: KTextStyle.titleTealText),
                      Text("description", style: KTextStyle.descriptionText),
                    ],
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
