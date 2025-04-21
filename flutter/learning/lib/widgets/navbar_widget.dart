import 'package:flutter/material.dart';
import 'package:learning/data/notifiers.dart';

class NavbarWidget extends StatefulWidget {
  const NavbarWidget({super.key});

  @override
  State<NavbarWidget> createState() => _NavbarWidgetState();
}

class _NavbarWidgetState extends State<NavbarWidget> {
  int currentIndex = 0;
  @override
  Widget build(BuildContext context) {
    return ValueListenableBuilder(valueListenable: slectedPageNotifier, builder: (context, value, child) {
      return NavigationBar(destinations: [
      NavigationDestination(icon: Icon(Icons.home), label: "Home"),
      NavigationDestination(icon: Icon(Icons.person), label: "Profile"),
    ],
    onDestinationSelected: (int value) {
      setState(() {
        currentIndex = value;
       
      });
    },);
    },);
  }
}