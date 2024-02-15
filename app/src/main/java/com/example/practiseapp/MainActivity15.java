package com.example.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        textView0=findViewById(R.id.txt0);
        textView0.setText(getIntent().getStringExtra("dtdtk"));

        textView = (TextView) findViewById(R.id.txt1);
        textView.setText(getIntent().getStringExtra("tk"));


        textView2 = (TextView) findViewById(R.id.txt2);
        textView2.setText(getIntent().getStringExtra("doller"));

        textView3 = (TextView) findViewById(R.id.txt3);
        textView3.setText(getIntent().getStringExtra("euro"));

        textView4 = (TextView) findViewById(R.id.txt4);
        textView4.setText(getIntent().getStringExtra("pound"));

        textView5 = (TextView) findViewById(R.id.txt5);
        textView5.setText(getIntent().getStringExtra("rupee"));

        textView6 = (TextView) findViewById(R.id.txt6);
        textView6.setText(getIntent().getStringExtra("chinruminbi"));


        textView7 = (TextView) findViewById(R.id.txt7);
        textView7.setText(getIntent().getStringExtra("russianruble"));
        textView8 = (TextView) findViewById(R.id.txt8);
        textView8.setText(getIntent().getStringExtra("swisfranc"));
        textView9 = (TextView) findViewById(R.id.txt9);
        textView9.setText(getIntent().getStringExtra("japaneyen"));
        textView10 = (TextView) findViewById(R.id.txt10);
        textView10.setText(getIntent().getStringExtra("saudirial"));
        textView11 = (TextView) findViewById(R.id.txt11);
        textView11.setText(getIntent().getStringExtra("kuwaitdinner"));


    }
}