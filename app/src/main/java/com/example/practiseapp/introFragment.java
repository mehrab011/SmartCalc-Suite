package com.example.practiseapp;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.practiseapp.R;
import com.example.practiseapp.introFragment;
import com.example.practiseapp.ui.main.MainViewModel;

public class introFragment extends Fragment {
    private MainViewModel mViewModel;
    public static com.example.practiseapp.ui.main.AboutActivity7Fragment newInstance(){
        return new com.example.practiseapp.ui.main.AboutActivity7Fragment();
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.intro_fragment, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }
}