package com.kellton.mvvmtest1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kellton.mvvmtest1.model.Places;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    MutableLiveData<List<Places>> mPlaces;

    public LiveData<List<Places>> getPlaces(){
        return mPlaces;
    }

}
