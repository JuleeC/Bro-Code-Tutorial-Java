import 'package:flutter/material.dart';

class HeroWidget extends StatelessWidget {
  const HeroWidget({super.key, required this.title});

  final String title;

  @override
  Widget build(BuildContext context) {
    return Stack(
      alignment: Alignment.center,
      children: [
        Hero(
          tag: "hero1",
          child: ClipRRect(
            borderRadius: BorderRadius.all(Radius.circular(30.0)),
            child: Image.asset(
              "assets/images/aes.jpg",
              color: Colors.teal,
              colorBlendMode: BlendMode.darken,
              width: double.infinity,
              height: 200.0,
            ),
          ),
        ),
        FittedBox(
          child: Text(
            title,
            style: TextStyle(
              fontWeight: FontWeight.normal,
              fontSize: 50.0,
              letterSpacing: 50.0,
              color: Colors.white30
            ),
          ),
        ),
      ],
    );
  }
}
