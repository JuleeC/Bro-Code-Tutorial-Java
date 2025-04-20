import 'package:flutter/material.dart';

class NavbarWidget extends StatefulWidget {
  const NavbarWidget({super.key});

  @override
  State<NavbarWidget> createState() => _NavbarWidgetState();
}

class _NavbarWidgetState extends State<NavbarWidget> {
  int currentIndex = 0;
  @override
  Widget build(BuildContext context) {
    return NavigationBar(
          destinations: [
            NavigationDestination(
              icon: Icon(Icons.home),
              label: "Home"),
              NavigationDestination(
              icon: Icon(Icons.person),
              label: "Profile"),],
              selectedIndex: currentIndex,
              onDestinationSelected: (int value) {
                
                setState(() {
                  //refresh the widget
                  currentIndex = value;
                });
                print(value);
              },),
  }
}