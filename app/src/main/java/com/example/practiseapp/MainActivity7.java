package com.example.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    public Spinner sp1,sp2;
    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        editText=findViewById(R.id.amount);
        sp1=findViewById(R.id.from);
        sp2=findViewById(R.id.to);
        button=findViewById(R.id.btn);
        textView=findViewById(R.id.convtxt);

        String[] from1= {"USD", "BDT", "EURO","INR","YEN","POUND","DINAR","RIYAL","CAD DOLLAR","SWISS FRANC",""};



        ArrayAdapter<String> ad1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,from1);

        ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(ad1);

        String[] to1= {"BDT", "USD", "EURO","INR","YEN","POUND","DINAR","RIYAL","CAD DOLLAR","SWISS FRANC",""};
        ArrayAdapter ad2=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,to1);
        sp2.setAdapter(ad2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double total;

                Double amount = Double.parseDouble(editText.getText().toString());

                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 84.6802;

                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.85;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 73.83;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 106.55;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.76;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.31;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 3.75;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 1.31;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 0.91;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 0.012;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.0100;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 0.87;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 1.26;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.0089;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.0036;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 0.044;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 0.015;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 0.011;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "BDT" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }

                else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 100.08;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 87.15;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 125.87;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.89;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.36;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 4.43;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 1.55;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 1.07;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 1.18;
                    textView.setText(total.toString());
                }

                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 1.15;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.011;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 1;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 1.44;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.010;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.0041;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 0.051;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 0.018;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 0.012;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "INR" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 0.014;
                    textView.setText(total.toString());
                }

                else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 0.80;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.0079;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 0.69;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.0071;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.0029;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 0.035;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 0.012;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 0.0085;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "YEN" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 0.0094;
                    textView.setText(total.toString());
                }


                else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 111.98;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 1.12;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 97.42;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 140.74;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.40;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 4.95;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 1.73;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 1.20;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "POUND" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 1.32;
                    textView.setText(total.toString());
                }


                else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 277.38;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 2.77;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 241.31;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 348.53;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 2.48;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 12.27;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 4.29;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 2.97;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "DINAR" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 0.00084;
                    textView.setText(total.toString());
                }


                else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 22.61;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.23;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 19.67;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 28.42;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.20;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.082;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 0.35;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 0.24;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "RIYAL" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 0.27;
                    textView.setText(total.toString());
                }


                else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 64.63;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.64;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 56.31;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 81.21;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.58;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.23;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 2.86;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 0.69;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "CAD DOLLAR" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 0.76;
                    textView.setText(total.toString());
                }

                else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "BDT") {
                    total = amount * 93.34;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "EURO") {
                    total = amount * 0.93;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "INR") {
                    total = amount * 81.20;
                    textView.setText(total.toString());
                }
                else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "YEN") {
                    total = amount * 117.29;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "POUND") {
                    total = amount * 0.83;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "DINAR") {
                    total = amount * 0.34;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "RIYAL") {
                    total = amount * 4.13;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "CAD DOLLAR") {
                    total = amount * 1.44;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "SWISS FRANC") {
                    total = amount * 1;
                    textView.setText(total.toString());
                } else if (sp1.getSelectedItem().toString() == "SWISS FRANC" && sp2.getSelectedItem().toString() == "USD") {
                    total = amount * 1.10;
                    textView.setText(total.toString());
                }










            }

        });

    }
}
