import 'package:flutter/material.dart';
import 'package:learning/widgets/hero_widget.dart';

class LoginPage extends StatefulWidget {
  const LoginPage({super.key});

  @override
  State<LoginPage> createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  TextEditingController controller = TextEditingController();


  @override
  void dispose() {
    //when the widget is removed from the widget tree
    controller.dispose();
    super.dispose();
  }
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Padding(
        padding: const EdgeInsets.all(10.0),
        child: Column(
          children: [
            HeroWidget(title: "Login"),
            
            TextField(
              controller: controller,
              decoration: InputDecoration(
                labelText: "Enter your name",
                hintText: "Name",
                border: OutlineInputBorder(),
              ),
              onEditingComplete: () {
                setState(() {
                 //
                });
              },
            ),
          ],
        ),
      ),
    );
  }
}