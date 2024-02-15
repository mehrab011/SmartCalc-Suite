package com.example.practiseapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.practiseapp.Main14Activity;
import com.example.practiseapp.MainActivity10;
import com.example.practiseapp.MainActivity13;
import com.example.practiseapp.MainActivity3;
import com.example.practiseapp.MainActivity6;
import com.example.practiseapp.MainActivity8;
import com.example.practiseapp.R;
import com.example.practiseapp.TempSp;
import com.example.practiseapp.UnitSplash;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;

    FragmentActivity context;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final Button button1 = root.findViewById(R.id.btn1);
        final Button button2 = root.findViewById(R.id.btn2);
        final Button button3 = root.findViewById(R.id.btn3);
        final Button button4 = root.findViewById(R.id.btn4);
        final Button button5 = root.findViewById(R.id.btn5);
        final Button button6 = root.findViewById(R.id.btn6);
        final Button button7 = root.findViewById(R.id.btn7);
        final Button button8 = root.findViewById(R.id.btn8);


        context = getActivity();
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);




        return root;
    /* binding=FragmentHomeBinding.inflate(getLayoutInflater());
     return binding.getRoot();
    }
    public void onViewCreated(View view,Bundle savedInstancestate){
        super.onViewCreated(view,savedInstancestate);

        binding.button1.setOnClick
    }
}

*/
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn1) {

            Intent intent = new Intent(context, MainActivity3.class);
            startActivity(intent);
        }


        if (id == R.id.btn2) {
            Intent intent1 = new Intent(context, MainActivity6.class);
            startActivity(intent1);
        }

        if (id == R.id.btn3) {
            Intent intent2 = new Intent(context, MainActivity8.class);
            startActivity(intent2);
        }

        if (id == R.id.btn4){
            Intent intent3 = new Intent(context, MainActivity10.class);
        startActivity(intent3);

    }

            if(id== R.id.btn5) {
                Intent intent4 = new Intent(context, MainActivity13.class);
                startActivity(intent4);

            }
        if(id== R.id.btn6) {
            Intent intent5 = new Intent(context, Main14Activity.class);
            startActivity(intent5);
        }


        if(id== R.id.btn7) {
            Intent intent6 = new Intent(context, UnitSplash.class);
            startActivity(intent6);
        }
        if(id== R.id.btn8) {
            Intent intent7 = new Intent(context, TempSp.class);
            startActivity(intent7);
        }





        }
    }






