import 'package:flutter/material.dart';
import 'package:learning/data/notifiers.dart';
import 'package:learning/views/pages/welcome_page.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.all(20),
      child: Column(
        children: [
          CircleAvatar(
            radius: 50,
            backgroundImage: AssetImage("assets/images/aes.jpg"),
          ),
          ListTile(
            title: Text("Logout"),
            onTap: () {
              selectedPageNotifier.value = 0;
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) {
                    return WelcomePage();
                  },
                ),
              );
            },
          ),
        ],
      ),
    );
  }
}
