import 'package:flutter/material.dart';

class SettingsPage extends StatefulWidget {
  const SettingsPage({super.key, required this.title});
  final String title;

  @override
  State<SettingsPage> createState() => _SettingsPageState();
}

class _SettingsPageState extends State<SettingsPage> {
  TextEditingController controller = TextEditingController();
  bool? isChecked = false;
  bool isSwitched = false;
  double sliderValue = 10.0;
  String? menuItem = "e1";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),

        //automaticallyImplyLeading: false, //this will remove the back button
        automaticallyImplyLeading: true,
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            ElevatedButton(
              onPressed: () {
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                    duration: Duration(seconds: 5),
                    content: Text("Snackbar"),
                    behavior: SnackBarBehavior.floating,
                  ),
                );
              },
              child: Text("open Snackbar"),
            ),
            ElevatedButton(
              onPressed: () {
                showDialog(
                  context: context,
                  builder: (context) {
                    return AlertDialog(
                      title: Text("Alert Title"),
                      content: Text("Alert Dialog"),
                      actions: [
                        FilledButton(onPressed: () {
                          Navigator.pop(context);
                        }, child: Text("Close")),
                      ],
                    );
                  },
                );
              },
              child: Text("open Snackbar"),
            ),
            TextField(
              controller: controller,
              decoration: InputDecoration(
                labelText: "Enter your name",
                hintText: "Name",
                border: OutlineInputBorder(),
              ),
            ),
            CheckboxListTile(
              title: Text(""),
              value: isChecked,
              onChanged: (value) {
                setState(() {
                  isChecked = value;
                });
              },
            ),
            SwitchListTile(
              title: Text("Switch me"),
              value: isSwitched,
              onChanged: (value) {
                setState(() {
                  isSwitched = value;
                });
              },
            ),
            Slider(
              value: sliderValue,
              min: 0.0,
              max: 100.0,
              divisions: 10,
              label: sliderValue.round().toString(),
              onChanged: (value) {
                setState(() {
                  sliderValue = value;
                });
              },
            ),
            DropdownButton<String>(
              value: menuItem,
              items: [
                DropdownMenuItem(value: "e1", child: Text("Item 1")),
                DropdownMenuItem(value: "e2", child: Text("Item 2")),
                DropdownMenuItem(value: "e3", child: Text("Item 3")),
              ],
              onChanged: (value) {
                setState(() {
                  menuItem = value;
                });
              },
            ),
          ],
        ),
      ),
    );
  }
}
