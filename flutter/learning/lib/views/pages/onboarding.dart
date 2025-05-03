import 'package:flutter/material.dart';
import 'package:learning/views/widget_tree.dart';
import 'package:lottie/lottie.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({super.key, required this.title});

  final String title;


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
                
                SizedBox(height: 20.0),
                FilledButton(
                  onPressed: () {
                     Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) {
                          return LoginPage(title: "Login");
                        },
                      ),
                    );
                  },
                  style: FilledButton.styleFrom(
                    minimumSize: Size(double.infinity, 40.0),
                  ),
                  child: Text(title),
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
