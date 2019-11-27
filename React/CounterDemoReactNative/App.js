import React from 'react';

import {
  SafeAreaView, Button, View, Text, StatusBar,
} from 'react-native';

const App: () => React$Node = () => {
  return (
    <>
      <StatusBar />
      <SafeAreaView style={{
        flex: 1,
        justifyContent: 'center',
        alignContent: "center",
      }}>
        <View>
          <CounterDemo />
        </View>
      </SafeAreaView>
    </>
  );
};

class CounterDemo extends React.Component {
  constructor(props) {
    super(props);
    this.state = { counter: 0 };
    this.handleClicked = this.handleClicked.bind(this);
  }

  render() {
    return <View>
      <View style={{
        height: 100,
        alignItems: "center",
        justifyContent: 'center',
      }}>
        {this.text()}
      </View>
      <Button title="Klick"
        onPress={this.handleClicked} />
    </View>
  }

  text() {
    if (this.state.counter == 0) {
      return <Text style={{ fontStyle: "italic", fontSize: 16 }}>Noch nicht geklickt</Text>;
    }
    return <Text style={{ fontWeight: 'bold', fontSize: 72 }}>{this.state.counter}</Text>;
  }

  button() {
    return <Button title="Klick" onPress={this.handleClicked} />;
  }

  handleClicked() {
    this.setState(state => ({
      counter: state.counter + 1
    }));
  }
}

export default App;