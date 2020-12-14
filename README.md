# MMCodeJavaAndroid: Myanmar Unicode font fixed in Java

MMCodeJavaAndroid is an android library that fixed most of the Myanmar Unicode fonts problem in Java programming language.
For example, In the Android in Java Project, If you are implementing a Bluetooth printer case, but most Myanmar Unicode fonts are not showing the correct way. In this case, you can use this library in your project.


## Getting started

### Setting up the dependency

```groovy
   implementation 'com.github.yamindroid:MMCodeJavaAndroid:1.0.0'
```

### How to use

```java
package com.mm.yaminoo.mmcodejavaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mm.yaminoo.mmcodejava.MMUnicode;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "MMCodeJava:  Fix Font = "+ MMUnicode.fixFont("Covid ကာလအတွင်း\n" +
                "အပြင်သွားတိုင်း mask တပ် ပါ\n" +
                "လက်ကိုမကြာခဏဆေးပေးပါ"));
    }
}
```

## LICENSE

    Copyright 2020-present Ya Min Oo.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

