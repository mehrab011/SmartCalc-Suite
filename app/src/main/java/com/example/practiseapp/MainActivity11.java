package com.example.practiseapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        btn1=findViewById(R.id.btnReset);
        btn2=findViewById(R.id.exit);

        final EditText edweg,edHei;
        final TextView txtRes,txtInter;
        Button btnRes,btnReset;

        edweg=(EditText) findViewById(R.id.Weight);
        edHei=(EditText) findViewById(R.id.Height);
        txtInter=(TextView)findViewById(R.id.txtinter);
        txtRes=(TextView) findViewById(R.id.txtRes);
        btnRes=(Button) findViewById(R.id.btnres);
        btnReset=(Button) findViewById(R.id.btnReset);

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strweg=edweg.getText().toString();
                String strhei=edHei.getText().toString();
                if(strweg.equals("")) {
                    edweg.setError("Please Enter Your Weight");
                    edweg.requestFocus();
                    return;
                }
                if(strhei.equals("")){
                    edHei.setError("Please Enter Your Height");
                    edHei.requestFocus();
                    return;
                }
                float weight=Float.parseFloat(strweg);
                float height=Float.parseFloat(strhei)/100;
                float bmiValue=BMICalculator(weight,height);
                txtInter.setText(interpreteBMI(bmiValue));
                txtRes.setText("BMI= "+bmiValue);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edHei.setText("");
                edweg.setText("");
                txtInter.setText("");
                txtRes.setText("");
            }
        });
btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity11.this,MainActivity2.class);
        startActivity(intent);
    }
});
    }
    public float BMICalculator(float weight,float height){
        return weight/(height * height);
    }
    public String interpreteBMI(float bmivalue){
        if(bmivalue < 16) {
            return "Servely Underweight";
        }
        else if(bmivalue <18.5){
            return "Underweight";
        }
        else if(bmivalue <25){
            return "Normal";
        }
        else if(bmivalue <30){
            return "OverWeight";
        }
        else
            return "Obese";


    }
}



