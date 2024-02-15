package com.example.practiseapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private MutableLiveData<String> mText;

    public MainViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Disclaimer");
    }

    public LiveData<String> getText() {
        return mText;
    }
}