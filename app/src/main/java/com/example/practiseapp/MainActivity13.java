package com.example.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);

        final EditText orginal,disc;
        final TextView txtInter;
        Button btnRes,btnReset,exit;
        final TextView savetx;

        orginal=(EditText) findViewById(R.id.orgp);
        disc=(EditText) findViewById(R.id.dcp);
        txtInter=(TextView) findViewById(R.id.txtRes);
        btnRes=(Button) findViewById(R.id.btnres);
        btnReset=(Button) findViewById(R.id.btnReset);
        savetx=findViewById(R.id.txtsave);
        exit=findViewById(R.id.btnexit);

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strorg=orginal.getText().toString();
                String strdc=disc.getText().toString();
                if(strorg.equals(" ")){
                    orginal.setError("Please Enter Your Orginal Price");
                    orginal.requestFocus();
                    return;

                }
                if(strdc.equals(" ")){
                    orginal.setError("Please Enter Your Parcentage of Discount");
                    orginal.requestFocus();
                    return;

                }
                float ogt=Float.parseFloat(strorg);
                float dct=Float.parseFloat(strdc);
                float fin=Disco(ogt,dct);
                txtInter.setText("Discounted Price= "+fin);
                float save=ogt-fin;

                savetx.setText("You Save="+save);



            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity13.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orginal.setText("");
                disc.setText("");
                txtInter.setText("");

            }
        });

    }



    public float Disco(float ogt,float dct){
        return ogt-(ogt*dct)/100;
    }




}