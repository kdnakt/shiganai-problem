// @flow

import React, { Component } from 'react';
import {
  View,
  Text,
  StyleSheet,
  ActivityIndicator,
} from 'react-native';
import Button from 'apsl-react-native-button'
import {
  getShiganai,
} from './ShiganaiService';

class ShiganaiScreen extends Component<{}> {
  constructor(props: {}) {
    super(props);
    this.state = { shiganai: getShiganai() };
  }

  retryShiganai() {
    this.setState({
      shiganai: getShiganai()
    })
  }

  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.text}>
          { this.state.shiganai }
        </Text>
        <Button
          onPress={() => this.retryShiganai()}
          style={styles.retryButton}
        >
          Retry
        </Button>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    fontSize: 20,
    marginVertical: 8,
    paddingHorizontal: 50,
  },
  retryButton: {
    backgroundColor: 'skyblue',
    width: '80%',
  }
});

export default ShiganaiScreen;
