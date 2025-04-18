import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

//stateful widget = can refresh
//stateless = cant refresh
//setsate = to refresh the widget

//calls an exception when the title is null
String? title = "Flutter App";
//stateless widget
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    //material app
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: Colors.teal,
          brightness: Brightness.dark,)
          ),
       
      //scaffold
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  // here always refresh the widget
  int currentIndex = 0;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(title!),
          centerTitle: true,
        ),
        body: currentIndex == 0
            ? Center(
                child: Text("Home"),
              )
            : Center(
                child: Text("Profile"),
              ),
        bottomNavigationBar: NavigationBar(
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
            
      );
      
  }
}

