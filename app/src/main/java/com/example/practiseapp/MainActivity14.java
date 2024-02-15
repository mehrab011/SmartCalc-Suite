package com.example.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practiseapp.ui.main.MainFragment;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity3);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}