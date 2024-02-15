package com.example.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main14Activity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView txtInt;

    private static DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        button = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.et1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taka=editText.getText().toString();
                double dtk=Double.parseDouble(taka);
                double tkt=dtk*1;
                double dol=dtk*0.012;
                double eur=dtk*0.01;
                double poun =dtk*0.009;
                double rupe=dtk*0.879;
                double chinrumin=dtk*0.0818;
                double russianrub=dtk*0.858;
                double ausdol=dtk*0.0118;
                double swisfra=dtk*0.0108;
                double japanye=dtk*1.26;
                double qatar=dtk*0.0429;
                double saudi=dtk*0.0442;
                double kuwait=dtk*0.0036;

                df.setRoundingMode(RoundingMode.UP);






                String doller=String.valueOf(dol);
                String euro=String.valueOf(eur);
                String pound=String.valueOf(df.format(poun));
                String rupee=String.valueOf(rupe);

                String chinruminbi=String.valueOf(chinrumin);
                String russianruble=String.valueOf(russianrub);
                String swisfranc=String.valueOf(swisfra);
                String japaneyen=String.valueOf(japanye);
                String saudirial=String.valueOf(saudi);
                String kuwaitdinner=String.valueOf(kuwait);
                String dtdtk=String.valueOf(tkt);

                Intent intent=new Intent(Main14Activity.this,MainActivity15.class);
                intent.putExtra("doller",doller);
                intent.putExtra("euro",euro);


                intent.putExtra("pound",pound);
                intent.putExtra("rupee",rupee);
                intent.putExtra("chinruminbi",chinruminbi);
                intent.putExtra("russianruble",russianruble);
                intent.putExtra("swisfranc",swisfranc);
                intent.putExtra("japaneyen",japaneyen);
                intent.putExtra("saudirial",saudirial);
                intent.putExtra("kuwaitdinner",kuwaitdinner);
                intent.putExtra("tk",taka);
                intent.putExtra("dtdtk",dtdtk);






                startActivity(intent);


            }
        });


    }

}