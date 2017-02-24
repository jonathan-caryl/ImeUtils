ImeUtils
========

Showing and hiding the soft keyboard on Android can be a bit hit-and-miss, here we add a simple API to do it. Based on code from [Plaid](https://github.com/nickbutcher/plaid).

Showing the soft keyboard is as simple as

```java
    ImeUtils.from(someView).showIme();
```

and to hide it

```java
    ImeUtils.from(someView).hideIme();
```

Download
--------

```groovy
dependencies {
    compile 'org.jonathancaryl.imeutils:imeutils:0.9.0'
}
```


License
-------
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
   