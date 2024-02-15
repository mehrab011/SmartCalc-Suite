package com.example.practiseapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity implements View.OnClickListener {
    Button btnsend, btnexit;
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        btnsend = findViewById(R.id.btnsend);
        btnexit = findViewById(R.id.btnclr);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnsend.setOnClickListener(this);
        btnexit.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        try {
            String name=et1.getText().toString();
            String gamil=et2.getText().toString();

           if(v.getId()==R.id.btnsend)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                String subjext = "Feedback";
                String body = " ";
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mehrabbhu16@gamil.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");

                intent.putExtra(Intent.EXTRA_TEXT,"Name:"+name + "\n Message: "+gamil);
                startActivity(Intent.createChooser(intent, "Feedback with"));



            }

           else if(v.getId()==R.id.btnexit);
            {
                et1.setText("");
                et2.setText("");


            }




        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception: "+e,Toast.LENGTH_SHORT).show();

        }




    }
}