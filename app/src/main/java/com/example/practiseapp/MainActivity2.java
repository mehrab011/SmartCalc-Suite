package com.example.practiseapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;

public class MainActivity2 extends AppCompatActivity {


    private AppBarConfiguration mAppBarConfiguration;
    private AdView mAdView;
    private AdView adView;
    AdRequest adRequest;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



         DrawerLayout drawer =findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallary, R.id.nav_about, R.id.nav_instruction, R.id.nav_contacts, R.id.nav_share, R.id.nav_mail)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        MobileAds.initialize(this,"ca-app-pub-9786589517469771~3755461347");

        adView = (AdView) findViewById(R.id.ad_view);
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);



    }



    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are You Sure You Want to Exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        finish();
                        //MainActivity2.super.onBackPressed();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();



    }





    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity, menu);

        return true;


    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        int id=item.getItemId();
        if(id==R.id.sharemenu){

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");


            String body ="Hey! I am Mehrab.I developed this application.This App is Making easy to All type of calculate.Please go to the link and do install, hopefully this will help you a little bit."+"https://drive.google.com/file/d/1chdYOLb7TdbrXRjSZnCgq6-_8f7teu16/view?fbclid=IwAR2iZNBVcX0BwPnIbeFT2jtMOjEBBSkxCHDIzAiOOAK1Jqyt2O0ZA34JEwA";
            intent.putExtra(Intent.EXTRA_TEXT, body);
            startActivity(Intent.createChooser(intent, "Share with"));
            //return true;

        }

            if(id==R.id.feedbackmenu) {

                Intent intent1 = new Intent(MainActivity2.this, Feedback.class);
                startActivity(intent1);
                return true;

            }



            if(id==R.id.mailmenu) {

                Intent intent2 = new Intent(Intent.ACTION_SEND);
                String[] recipients = {"mehrabbhu16@gmail.com"};
                intent2.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent2.putExtra(Intent.EXTRA_SUBJECT, "Subject text here...");
                intent2.putExtra(Intent.EXTRA_TEXT, "Body of the content here...");
                intent2.putExtra(Intent.EXTRA_CC, "mailcc@gmail.com");
                intent2.setType("text/html");
                intent2.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent2, "Send mail"));


            }






        return super.onOptionsItemSelected(item);



    }

}
