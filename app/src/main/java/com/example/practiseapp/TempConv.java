package com.example.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TempConv extends AppCompatActivity {
    public Spinner sp1,sp2;
    EditText editText;
    TextView textView;
    Button button;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_conv_activity);

        editText=findViewById(R.id.amount);
        sp1=findViewById(R.id.from);
        sp2=findViewById(R.id.to);
        button=findViewById(R.id.btn);
        textView=findViewById(R.id.convtxt);
        exit=findViewById(R.id.tempexit);


        String[] from1= {"Celsius °C","Fahrenheit °F", "Kelvin K"};
        ArrayAdapter<String> ad1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,from1);

        ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(ad1);

        String[] to1= {"Fahrenheit °F","Celsius °C", "Kelvin K"};
        ArrayAdapter<String> ad2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,to1);

        ad2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(ad2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double total;


                Double amount = Double.parseDouble(editText.getText().toString());

                String strorg=editText.getText().toString();

                if(strorg.equals("")){
                    editText.setError("Please Enter the Temperature.. ");
                    editText.requestFocus();
                    return;

                }
                else if (sp1.getSelectedItem().toString() == "Celsius °C" && sp2.getSelectedItem().toString() == "Fahrenheit °F") {
                    total = (amount * 9 / 5) + 32;

                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Celsius °C" && sp2.getSelectedItem().toString() == "Kelvin K") {
                    total = amount + 273.15;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Celsius °C" && sp2.getSelectedItem().toString() == "Celsius °C") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Fahrenheit °F" && sp2.getSelectedItem().toString() == "Celsius °C") {
                    total = (amount - 32) * 5 / 9;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Fahrenheit °F" && sp2.getSelectedItem().toString() == "Kelvin K") {
                    total = (amount - 32) * 5 / 9 + 273.15;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Fahrenheit °F" && sp2.getSelectedItem().toString() == "Fahrenheit °F") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kelvin K" && sp2.getSelectedItem().toString() == "Fahrenheit °F") {
                    total = (amount - 273.15) * 9 / 5 + 32;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kelvin K" && sp2.getSelectedItem().toString() == "Kelvin K") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kelvin K" && sp2.getSelectedItem().toString() == "Celsius °C") {
                    total = amount - 273.15;
                    textView.setText(total.toString());
                }


            }






        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TempConv.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }

}
