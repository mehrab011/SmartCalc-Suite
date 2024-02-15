package com.example.practiseapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity3 extends AppCompatActivity {



    private InterstitialAd mInterstitialAd;

    TextView textView;
   Button btn1;
   Button chartbtn,worksbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);


        MobileAds.initialize(this,
                "ca-app-pub-3940256099942544~3347511713");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


      textView=(TextView) findViewById(R.id.txt1);
      btn1=(Button)findViewById(R.id.spbtn1);
        chartbtn=(Button)findViewById(R.id.chart);
        worksbtn=(Button)findViewById(R.id.works);


       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
               startActivity(intent);
           }
       });

       chartbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent i=new Intent(MainActivity3.this,Gpachart.class);
                startActivity(i);
           }
       });
        worksbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity3.this,WorksAct.class);
                startActivity(i);
            }
        });

    }
}