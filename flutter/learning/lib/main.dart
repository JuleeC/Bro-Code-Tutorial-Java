import 'package:device_preview/device_preview.dart';
import 'package:flutter/material.dart';
import 'package:learning/data/constants.dart';
import 'package:learning/data/notifiers.dart';
import 'package:learning/views/pages/welcome_page.dart';
import 'package:shared_preferences/shared_preferences.dart';

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
class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  void initState() {
    initThemeMode();
    super.initState();
    
  }

  void initThemeMode() async{
    final SharedPreferences prefs = await SharedPreferences.getInstance();
    final bool? repeat = prefs.getBool(KConstants.themeModekKey);
    isDarkModeNotifier.value = repeat ?? true;
  }
  @override
  Widget build(BuildContext context) {
    //material app
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
          home: WelcomePage(),
        );
      },
      //scaffold
    );
  }
}
