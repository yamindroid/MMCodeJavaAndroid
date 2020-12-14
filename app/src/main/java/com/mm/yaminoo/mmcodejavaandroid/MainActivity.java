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

        Log.e(TAG, "MMCodeJava:  Before  ....Covid ကာလအတွင်း\n" +
                "အပြင်သွားတိုင်း mask တပ် ပါ\n" +
                "လက်ကိုမကြာခဏဆေးပေးပါ\n\n\n" );

        Log.e(TAG, "MMCodeJava:  After  ...."+ MMUnicode.fixFont("Covid ကာလအတွင်း\n" +
                "အပြင်သွားတိုင်း mask တပ် ပါ\n" +
                "လက်ကိုမကြာခဏဆေးပေးပါ"));
    }
}