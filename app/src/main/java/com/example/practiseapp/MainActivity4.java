package com.example.practiseapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practiseapp.MainActivity5;
import com.example.practiseapp.R;

import java.time.chrono.Era;
public class MainActivity4 extends AppCompatActivity {
    private EditText Credit,Grade,course_name;
    private Button addCourse,seeGpa,erase,exit;
    private TextView textView;

    double counter=0,total_credit=0,credit=0,grade=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Credit = findViewById(R.id.editText1);
        Grade = findViewById(R.id.editText2);
        addCourse = findViewById(R.id.button);
        seeGpa = findViewById(R.id.button2);
        erase = findViewById(R.id.resetgpa);
        exit = findViewById(R.id.exitgpa);


        course_name=findViewById(R.id.course_name);

        addCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= String.valueOf(course_name.getText());
                credit = Double.parseDouble(Credit.getText().toString());
                grade = Double.parseDouble(Grade.getText().toString());
                counter += (grade*credit);
                total_credit+=credit;
                Toast.makeText(getApplicationContext(),"Name : "+s+"\nCredit : "+credit+"\ngrade : "+grade,Toast.LENGTH_LONG).show();
                Credit.setText("");
                Grade.setText("");
                course_name.setText(" ");
            }
        });
        seeGpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = counter/total_credit;

                String rs=Double.toString(result);

                Intent i = new Intent(MainActivity4.this, MainActivity5.class);

                i.putExtra("%.4f", rs);
                startActivity(i);
            }
        });
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                total_credit=0;
                credit=0;
                grade=0;
                Credit.setText("");
                Grade.setText("");
                course_name.setText(" ");
            }
        });

exit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(MainActivity4.this,MainActivity2.class);
        startActivity(i);
    }
});
    }
}