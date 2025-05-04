import 'package:flutter/material.dart';
import 'package:learning/widgets/container_widget.dart';
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
            ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),
            ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),ContainerWidget(
              title: "Basic Layout",
              description: "This is a basic layout of a flutter app.",
            ),
                     
          ],
        ),
      ),
    );
  }
}
