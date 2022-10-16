<div align="center"> <h1 align="center">Jump</h1> </div>

<p align="center">
Customizable Bounce Animation 
</p>

<p align="center">
  <img src="https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white">
  <img src="https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=android-studio&logoColor=white">
</p>

<p align="center">
  <img src="https://jitpack.io/v/tfaki/jump.svg">
  <img src="https://img.shields.io/badge/License-Apache_2.0-blue.svg">
</p>

<p align="center">
 <img src="jumping_top.gif" width="30%"/>
  <img src="jumping_button.gif" width="30%"/>
  <img src="jumping_bottom.gif" width="30%"/>
</p>
  
  <p align="center">
</p>

## Gradle
- Add the dependency below to your module's `build.gradle` file:
```xml
dependencies {
    implementation 'com.github.tfaki:jump:1.0.0'
}
``` 
- Add the maven to your `settings.gradle` file
```xml
maven { url 'https://jitpack.io' }
```

## How to Use
```python
Jump(
  toDirection = 150 // bounce to direction
) {
  // your content                        
}
```
> toDirection is required. How much do you want the jump animation

## Jump Bounce Animation Type
```javascript
BounceType.HIGH_BOUNCE
BounceType.MEDIUM_BOUNCE
BounceType.LOW_BOUNCE
BounceType.NO_BOUNCE
```

## Find this library useful? 🤩
Support it by joining [stargazers](https://github.com/tfaki/jump/stargazers) for this repository. ⭐

## License

```xml
Copyright 2022 tfaki (Talha Fakioglu)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
