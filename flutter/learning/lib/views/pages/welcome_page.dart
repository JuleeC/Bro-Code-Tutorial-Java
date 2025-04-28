import 'package:flutter/material.dart';
import 'package:learning/views/widget_tree.dart';

import 'package:lottie/lottie.dart';

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.end,
          children: [
            Lottie.asset(
              "assets/lotties/welcome.json",
              width: 200,
              height: 200,
            ),
            Text("Flutter App", style: TextStyle(fontWeight: FontWeight.bold, fontSize: 50.0, letterSpacing: 50.0)),
            FilledButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) {
                      return WidgetTree();
                    },
                  ),
                );
              },
              child: Text("Login"),
            ),
          ],
        ),
      ),
    );
  }
}
