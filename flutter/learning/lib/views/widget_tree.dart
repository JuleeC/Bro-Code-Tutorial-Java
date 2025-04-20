import 'package:flutter/material.dart';
import 'package:learning/views/pages/home_page.dart';
import '../widgets/navbar_widget.dart';
import 'package:learning/views/pages/profile_page.dart';

List<Widget> pages = [
  HomePage(),
  ProfilePage(),
];

class WidgetTree extends StatelessWidget {
  const WidgetTree({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("title"),
          centerTitle: true,
        ),
        //if statement but dynamic
        bottomNavigationBar: NavbarWidget()
            
    );
      }
      
  }
