import 'package:flutter/material.dart';

class ExpandedFlexibleTestPage extends StatelessWidget {
  const ExpandedFlexibleTestPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Column(
        children: [
          // Expanded(flex: 2,child: Container(color: Colors.teal)),
          // Expanded(child: Container(color: Colors.teal)),
          Row(
            children: [
              Expanded(child: Container(color: Colors.teal, height: 20,child: Text("Hello"))),
              Flexible(child: Container(color: Colors.orange, height: 20,child: Text("Hello"))),
            ],
          ),
        ],
      ),
    );
  }
}
