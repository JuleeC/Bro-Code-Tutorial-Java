import 'package:flutter/material.dart';
import 'package:learning/widgets/hero_widget.dart';

class LoginPage extends StatefulWidget {
  const LoginPage({super.key});

  @override
  State<LoginPage> createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  TextEditingController controllerPw = TextEditingController();
  TextEditingController controllerEmail = TextEditingController();

  @override
  void dispose() {
    //when the widget is removed from the widget tree
    controllerPw.dispose();
    controllerEmail.dispose();
    super.dispose();
  }
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          children: [
            HeroWidget(title: "Login"),
            SizedBox(height: 20.0),  
            TextField(
              controller: controllerEmail,
              decoration: InputDecoration(
                labelText: "Enter your email",
                hintText: "Email",
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(10.0),
                                 ),
              ),
              onEditingComplete: () {
                setState(() {
                 //
                });
              },
            ),SizedBox(height: 10.0),  
            TextField(
              controller: controllerPw,
              decoration: InputDecoration(
                labelText: "Enter your Password",
                hintText: "Password",
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(10.0),
                 
                ),
              ),
              onEditingComplete: () {
                setState(() {
                 //
                });
              },
            ), SizedBox(height: 20.0),
            FilledButton(
              onPressed: () {
                Navigator.pushReplacement(
                  context,
                  MaterialPageRoute(
                    builder: (context) {
                      return LoginPage();
                    },
                  ),
                );
              },
              style: FilledButton.styleFrom(
                minimumSize: Size(double.infinity, 40.0),
              ),
              child: Text("Get Started"),
            ),
          ],
        ),
      ),
    );
  }
}