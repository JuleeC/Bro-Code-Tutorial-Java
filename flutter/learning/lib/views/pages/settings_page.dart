import 'package:flutter/material.dart';

class SettingsPage extends StatefulWidget {
  const SettingsPage({super.key});

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
        title: Text("Settings Page"),
       
        //automaticallyImplyLeading: false, //this will remove the back button
        automaticallyImplyLeading: false,
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            TextField(
              controller: controller,
              decoration: InputDecoration(
                labelText: "Enter your name",
                hintText: "Name",
                border: OutlineInputBorder(),
              ),
            ),
            CheckboxListTile(
              title: Text("Check me"),
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
