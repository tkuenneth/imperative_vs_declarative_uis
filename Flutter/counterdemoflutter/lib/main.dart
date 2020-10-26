import 'package:flutter/material.dart';

const _title = 'CounterDemo (Material)';

void main() => runApp(CounterDemo());

class CounterDemo extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: CounterDemoHomePage(title: _title),
    );
  }
}

class CounterDemoHomePage extends StatefulWidget {
  CounterDemoHomePage({Key key, this.title}) : super(key: key);
  final String title;

  @override
  _CounterDemoHomePageState createState() => _CounterDemoHomePageState();
}

class _CounterDemoHomePageState extends State<CounterDemoHomePage> {
  int _counter = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Container(
              height: 100,
              alignment: Alignment.center,
              child: _createText(_counter),
            ),
            MaterialButton(
                textTheme: ButtonTextTheme.primary,
                child: Text("Klick"),
                onPressed: () => setState(() {
                      _counter++;
                    }))
          ],
        ),
      ),
    );
  }

  Widget _createText(int counter) {
    if (counter == 0) {
      return Text(
        "Noch nicht geklickt",
        style: TextStyle(fontSize: 14, fontStyle: FontStyle.italic),
        textAlign: TextAlign.center,
      );
    } else {
      return Text('$counter',
          style: TextStyle(
              fontSize: 72,
              fontStyle: FontStyle.normal,
              fontWeight: FontWeight.bold),
          textAlign: TextAlign.center);
    }
  }
}
