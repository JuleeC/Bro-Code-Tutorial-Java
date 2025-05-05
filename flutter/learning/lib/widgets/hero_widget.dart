import 'package:flutter/material.dart';

class HeroWidget extends StatelessWidget {
  const HeroWidget({super.key, required this.title, this.nextPage});

  final String title;
  final Widget? nextPage;
  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap:
          nextPage != null
              ? () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) {
                      return nextPage!;
                    },
                  ),
                );
              }
              : null,
      child: Stack(
        alignment: Alignment.center,
        children: [
          Hero(
            tag: "hero1",
            child: AspectRatio(
              aspectRatio: 1.5,
              child: ClipRRect(
                borderRadius: BorderRadius.all(Radius.circular(30.0)),
                child: Image.asset(
                  "assets/images/aes.jpg",
                  color: Colors.teal,
                  colorBlendMode: BlendMode.darken,
                ),
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
                color: Colors.white30,
              ),
            ),
          ),
        ],
      ),
    );
  }
}
