import 'package:device_preview/device_preview.dart';
import 'package:flutter/material.dart';
import 'package:learning/data/notifiers.dart';
import 'package:learning/views/widget_tree.dart';

void main() {
  runApp(
    DevicePreview(
      builder: (context) {
        return const MyApp();
      },
    ),
    
  );
}

//stateful widget = can refresh
//stateless = cant refresh
//setsate = to refresh the widget
//splitting wideget into smaller widgets
//calls an exception when the title is null
String? title = "Flutter App";

//stateless widget
class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    //materias app
    return ValueListenableBuilder(
      valueListenable: isDarkModeNotifier,
      builder: (context, value, child) {
        return MaterialApp(
          title: title!,
          debugShowCheckedModeBanner: false,
          theme: ThemeData(
            colorScheme: ColorScheme.fromSeed(
              seedColor: Colors.teal,
              brightness: value ? Brightness.dark : Brightness.light,
            ),
          ),
          home: WidgetTree(),
        );
      },
      //scaffold
    );
  }
}
