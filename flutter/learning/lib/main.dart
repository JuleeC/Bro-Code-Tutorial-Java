import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

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
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Flutter App'),
          centerTitle: true,

        ),
        floatingActionButton: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            FloatingActionButton(
              onPressed: () {
                print("Floating Action Button Pressed");
              },
              child: const Icon(Icons.add),
            ),
            //like padding in that case
            SizedBox(height: 10), 
            FloatingActionButton(
              onPressed: () {
                print("Floating Action Button Pressed");
              },
              child: const Icon(Icons.add),
            ),
          ],
        ),
        bottomNavigationBar: NavigationBar(
          destinations: [
            NavigationDestination(
              icon: Icon(Icons.home),
              label: "Home"),
              NavigationDestination(
              icon: Icon(Icons.percent),
              label: "asd")],
              selectedIndex: 1,
              onDestinationSelected: (int value) {
                print(value);
              },),
            
      ),
    );
  }
}



