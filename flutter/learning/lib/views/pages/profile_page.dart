import 'package:flutter/material.dart';

class ProfilePage extends StatefulWidget {
  const ProfilePage({super.key});

  @override
  State<ProfilePage> createState() => _ProfilePageState();
}

class _ProfilePageState extends State<ProfilePage> {
  TextEditingController controller = TextEditingController();
  bool? isChecked = false;
  bool isSwitched = false;
  double sliderValue = 10.0; 
  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
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
            ), CheckboxListTile.adaptive(
              tristate: true,
              value: isChecked,
              title: Text("Check me"),
              onChanged: (bool? value) {
                setState(() {
                  isChecked = value;
                });
              },
            ),
            Switch.adaptive(value: isSwitched, onChanged: (bool value) {
              setState(() {
                isSwitched = value;
              });
            }),
            SwitchListTile.adaptive(
              value: isSwitched,
              title: Text("Switch me"),
              onChanged: (bool value) {
                setState(() {
                  isSwitched = value;
                });
              },
            ),
            Slider(value: sliderValue,
            max: 100.0,
            min: 10.0,
            onChanged: (double value) {
              setState(() {
                sliderValue = value;
              });
              print(value);
            }),
            InkWell(
              splashColor: Colors.red,
            
              onTap: () {
                print("Tapped");
              }, 
              child: Container(
                height: 50,
                width: 200,
                color: Colors.black,
              ),
              ),
            ElevatedButton(onPressed: () {}, child: Text("data")) 
          ],
        ),
      ),
    );
  }
}
