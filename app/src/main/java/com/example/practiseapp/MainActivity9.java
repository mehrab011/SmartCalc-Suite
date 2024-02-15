package com.example.practiseapp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practiseapp.ui.home.HomeFragment;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity9 extends AppCompatActivity {
    Button btBirth,btToday,btCalculate;
    TextView tvResult;
    Button btnext;

    DatePickerDialog.OnDateSetListener dateSetListener1,dateSetListener2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        btBirth=findViewById(R.id.btn_birth);
        btToday=findViewById(R.id.btn_today);
        btCalculate=findViewById(R.id.btn_calculate);
        tvResult=findViewById(R.id.tv_result);
       btnext =(Button) findViewById(R.id.btnext);

        Calendar calendar = Calendar.getInstance();
        final int year =calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONTH);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        String date=simpleDateFormat.format(Calendar.getInstance().getTime());
        btToday.setText(date);


        btBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity9.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,dateSetListener1,year,month,day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        dateSetListener1=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month =month+1;
                String date= day + "/" + month + "/" + year;
                btBirth.setText(date);
            }
        };

        btToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity9.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,dateSetListener2,year,month,day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        dateSetListener2=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month =month+1;
                String date= day + "/" + month + "/" + year;
                btToday.setText(date);
            }
        };

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String sDate=btBirth.getText().toString();
                String eDate=btToday.getText().toString();
                SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");



                try {
                    Date date1=simpleDateFormat1.parse(sDate);
                    Date date2=simpleDateFormat1.parse(eDate);

                    long startDate =date1.getTime();

                    long endDate=date2.getTime();

                    if(startDate <= endDate){

                        Period period =new Period(startDate,endDate,PeriodType.yearMonthDay());
                        int years=period.getYears();
                        int months=period.getMonths();
                        int days=period.getDays();
                        tvResult.setText(+years+" " + "Years | "+ months + " Months | "+ days +" Days |");

                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Birth Date should not be larger than today's date.",Toast.LENGTH_SHORT).show();
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        });


btnext.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity9.this, MainActivity2.class);
        startActivity(intent);
    }
});


    }
}