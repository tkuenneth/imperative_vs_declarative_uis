import 'package:flutter/cupertino.dart';

const _title = 'CounterDemo (Cupertino)';

void main() => runApp(CounterDemoCupertino());

class CounterDemoCupertino extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return CupertinoApp(
      title: _title,
      home: CounterDemoCupertinoHomePage(title: _title),
    );
  }
}

class CounterDemoCupertinoHomePage extends StatefulWidget {
  CounterDemoCupertinoHomePage({Key key, this.title}) : super(key: key);
  final String title;

  @override
  _CounterDemoCupertinoHomePageState createState() =>
      _CounterDemoCupertinoHomePageState();
}

class _CounterDemoCupertinoHomePageState
    extends State<CounterDemoCupertinoHomePage> {
  int _counter = 0;

  @override
  Widget build(BuildContext context) {
    return CupertinoPageScaffold(
      navigationBar: CupertinoNavigationBar(
        middle: Text(widget.title),
      ),
      child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Container(
              height: 100,
              alignment: Alignment.center,
              child: _createText(_counter),
            ),
            CupertinoButton(
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
