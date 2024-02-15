package com.example.practiseapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.practiseapp.R;

public class MainActivity5 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView =findViewById(R.id.txt1);
        Intent i=getIntent();
        Bundle b=i.getExtras();

        if(b!=null)
        {
            String j=(String) b.get("%.4f");
            textView.setText("Your GPA is = "+j);
        }

    }
}