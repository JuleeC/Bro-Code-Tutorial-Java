import 'package:flutter/material.dart';
import 'package:learning/data/constants.dart';
import 'package:lottie/lottie.dart';

class OnboardingPage extends StatelessWidget {
  const OnboardingPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Center(
        child: SingleChildScrollView(
          child: Padding(
            padding: const EdgeInsets.all(20.0),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Lottie.asset(
                  "assets/lotties/welcome.json",
                  width: 250,
                  height: 250,
                ),

                SizedBox(height: 50.0),
                Text(
                  "Flutter App is the way to learn Flutter",
                  style: KTextStyle.descriptionText,
                  textAlign: TextAlign.justify,
                ),
                FilledButton(
                  onPressed: () {},

                  style: ElevatedButton.styleFrom(
                    minimumSize: Size(double.infinity, 40.0),
                  ),
                  child: Text("Next"),
                ),
                SizedBox(height: 150.0),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
