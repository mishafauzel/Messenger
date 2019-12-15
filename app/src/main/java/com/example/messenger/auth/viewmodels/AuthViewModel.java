package com.example.messenger.auth.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;

import com.example.messenger.R;
import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    private static final String TAG = "AuthViewModel";


    private MutableLiveData<Boolean> isLoggetIn = new MutableLiveData<>(false);
    @Inject
    FirebaseAuth auth;
    public String code;
    public String phonenumber;
    private NavController navController;

    @Inject
    public AuthViewModel(FirebaseAuth auth) {
        this.auth = auth;
        Log.d(TAG, "AuthViewModel: viewModel for auth created");
    }
    public LiveData<Boolean> getIsLoggetIn() {
        return isLoggetIn;
    }


    public void executeLogin()
    {
        //TODO execute login
        navController.navigate(R.id.action_authFragmentFragment_to_messagesActivity);
    }
    public void checkLoginState()
    {
        isLoggetIn.setValue(auth.getCurrentUser() == null);
    }


}
