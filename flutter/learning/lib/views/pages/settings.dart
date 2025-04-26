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
    return SingleChildScrollView(
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            DropdownButton(
              value: menuItem,
              items: [
                DropdownMenuItem(value: "e1", child: Text("e11")),
                DropdownMenuItem(value: "e2", child: Text("e22")),
                DropdownMenuItem(value: "e3", child: Text("e33")),
              ],
              onChanged: (String? value) {
                setState(() {
                  menuItem = value;
                });
              
                
              },

            ),

            TextField(
              decoration: InputDecoration(border: OutlineInputBorder()),
              controller: controller,
              onEditingComplete: () => setState(() {}),
            ),

            Text(controller.text),
            Text(controller.text),
            Checkbox.adaptive(
              tristate: true,
              value: isChecked,
              onChanged: (bool? value) {
                setState(() {
                  isChecked = value;
                });
              },
            ),
            CheckboxListTile.adaptive(
              tristate: true,
              value: isChecked,
              title: Text("Check me"),
              onChanged: (bool? value) {
                setState(() {
                  isChecked = value;
                });
              },
            ),
            Switch.adaptive(
              value: isSwitched,
              onChanged: (bool value) {
                setState(() {
                  isSwitched = value;
                });
              },
            ),
            SwitchListTile.adaptive(
              value: isSwitched,
              title: Text("Switch me"),
              onChanged: (bool value) {
                setState(() {
                  isSwitched = value;
                });
              },
            ),
            Slider(
              value: sliderValue,
              max: 100.0,
              min: 10.0,
              onChanged: (double value) {
                setState(() {
                  sliderValue = value;
                });
                print(value);
              },
            ),
            InkWell(
              splashColor: Colors.red,

              onTap: () {
                print("Tapped");
              },
              child: Container(height: 50, width: 200, color: Colors.black),
            ),
            ElevatedButton(
              onPressed: () {},
              style: ElevatedButton.styleFrom(backgroundColor: Colors.teal),
              child: Text("data"),
            ),
            ElevatedButton(
              onPressed: () {},
              style: ElevatedButton.styleFrom(backgroundColor: Colors.teal),
              child: Text("data"),
            ),
            TextButton(
              onPressed: () {},
              style: TextButton.styleFrom(backgroundColor: Colors.teal),
              child: Text("data"),
            ),
            FilledButton(
              onPressed: () {},
              style: FilledButton.styleFrom(backgroundColor: Colors.teal),
              child: Text("data"),
            ),
            OutlinedButton(
              onPressed: () {},
              style: OutlinedButton.styleFrom(backgroundColor: Colors.teal),
              child: Text("data"),
            ),
            CloseButton(onPressed: () {}),
            BackButton(),
          ],
        ),
      ),
    );
  }
}
