# react-native-fbtee

[![react-native-fbtee on npm](https://badgen.net/npm/v/react-native-fbtee)](https://www.npmjs.com/package/react-native-fbtee)
[![react-native-fbtee downloads](https://badgen.net/npm/dm/react-native-fbtee)](https://www.npmtrends.com/react-native-fbtee)
[![react-native-fbtee install size](https://packagephobia.com/badge?p=react-native-fbtee)](https://packagephobia.com/result?p=react-native-fbtee)
[![CI status](https://github.com/retyui/react-native-fbtee/actions/workflows/build_android.yaml/badge.svg)](https://github.com/retyui/react-native-fbtee/actions/workflows/build_android.yaml)

## Getting started

* Android only
* support React Native's New & Old Architecture

```shell
yarn add react-native-fbtee
# or
npm install react-native-fbtee
```


## Usage

```tsx
import {Fbtee} from 'react-native-fbtee';

// Read resource based on system language
Fbtee.readLocalizationFile('localizable'); // string | null
// Read resource based on specific language (if downloaded)
Fbtee.readLocalizationFile('localizable', 'es');
Fbtee.readLocalizationFile('localizable', 'pt', 'BR');
```

## License

MIT
