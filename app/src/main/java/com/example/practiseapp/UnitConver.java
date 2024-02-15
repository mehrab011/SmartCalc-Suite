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

public class UnitConver extends AppCompatActivity {
    public Spinner sp1,sp2;
    EditText editText;
    TextView textView;
    Button button;
    Button ext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_conver_activity);

        editText=findViewById(R.id.amount);
        sp1=findViewById(R.id.from);
        sp2=findViewById(R.id.to);
        button=findViewById(R.id.btn);
        textView=findViewById(R.id.convtxt);
        ext=findViewById(R.id.extunit);

        String[] from1= {"Kilometer Km","Mile mi", "Meter m","Foot ft","Inch in", "Decimeter dm","Centimeter cm","Millimeter mm","Micrometer μm","Nanometer nm",};
        ArrayAdapter<String> ad1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,from1);

        ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(ad1);

        String[]  to1= {"Mile mi","Kilometer Km", "Meter m","Foot ft","Inch in", "Decimeter dm","Centimeter cm","Millimeter mm","Micrometer μm","Nanometer nm"};
        ArrayAdapter<String> ad2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,to1);

        ad2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(ad2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double total;


                Double amount = Double.parseDouble(editText.getText().toString());

                if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.621;

                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 1000;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 3280.84;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 39370.1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 10000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 100000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 1000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 1000000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 1000000*1000000;

                    textView.setText(total.toString());

                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Kilometer Km" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }












                else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 1.609;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 1609.344;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 5280;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 63360;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 16093.44;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 160934.4;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount *1609344 ;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 1609344000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount *1609344*1000000 ;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Mile mi" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }













                else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.000621371192;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 3.2808399;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 39.3700787;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 10;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 100;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 1000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 1000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 1000000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Meter m" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.001;
                    textView.setText(total.toString());
                }














                else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.000189;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.3048;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 12;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 3.048;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 30.48;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 304.8;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 304800;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 304800000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Foot ft" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.000305;
                    textView.setText(total.toString());
                }













                else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.00001578;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.0254;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 0.0833;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 0.254;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 2.54;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 25.4;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 25400;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 25400000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Inch in" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.0000254;
                    textView.setText(total.toString());
                }
















                else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.00006214;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.1;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 0.328084;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 3.937;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 10;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 100;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 100000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 100000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Decimeter dm" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.0001;
                    textView.setText(total.toString());
                }
















                else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.000006214;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.01;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 0.03281;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount *0.394 ;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 0.1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 10;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 10000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 10000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Centimeter cm" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.00001;
                    textView.setText(total.toString());
                }












                else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.0000006214;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.001;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount *0.0394;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 0.0394;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 0.01;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 0.1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 1000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 1000000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Millimeter mm" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.000001;
                    textView.setText(total.toString());
                }



















                else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.0000000006214;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.000001;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 0.0000032808;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 0.00003937;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 0.00001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 0.0001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 0.001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 1000;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Micrometer μm" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.000000001;
                    textView.setText(total.toString());
                }





















                else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Mile mi") {
                    total = amount * 0.0000000000006214;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Meter m") {
                    total = amount * 0.000000001;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Foot ft") {
                    total = amount * 0.00000000328084;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Inch in") {
                    total = amount * 0.00000003937;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Decimeter dm") {
                    total = amount * 0.00000001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Centimeter cm") {
                    total = amount * 0.0000001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Millimeter mm") {
                    total = amount * 0.000001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Micrometer μm") {
                    total = amount * 0.001;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Nanometer nm") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "Nanometer nm" && sp2.getSelectedItem().toString() == "Kilometer Km") {
                    total = amount * 0.000000000001;
                    textView.setText(total.toString());
                }










            }

        });

        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UnitConver.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }
}
