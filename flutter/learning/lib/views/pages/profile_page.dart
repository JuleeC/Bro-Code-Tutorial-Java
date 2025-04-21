import 'package:flutter/material.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: Column(
        children: [ 
          TextField(decoration:
           InputDecoration(
            border:OutlineInputBorder(),),),
        ]
      ),
    );
  }
}