package com.example.messenger.auth.viewmodels;

import android.app.Application;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;

import com.bumptech.glide.RequestManager;
import com.example.messenger.R;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.function.Consumer;

import javax.inject.Inject;

import static com.google.firebase.auth.PhoneAuthProvider.*;

public class AuthViewModel extends ViewModel {
    private static final String TAG = "AuthViewModel";


    private MutableLiveData<LoginState> isLoggetIn = new MutableLiveData<>(LoginState.NotLoggedIn);
    public enum LoginState{LogedIn,NotLoggedIn,PhoneNumberIncorrect}
    FirebaseAuth auth;
    Application application;
    public String code;
    public String phonenumber;


    @Inject
    public AuthViewModel(FirebaseAuth auth, Application application) {
        this.auth = auth;
        this.application=application;
        TelephonyManager telephonyManager=(TelephonyManager) application.getSystemService(Context.TELEPHONY_SERVICE);
        String iso=telephonyManager.getSimCountryIso();
        Log.d(TAG, "AuthViewModel: viewModel for auth created");
    }
    public LiveData<LoginState> getIsLoggetIn() {
        return isLoggetIn;
    }


    public void executeLogin()
    {

        //TODO check phone in edit text
        if(checkPhoneInEditText())
        {
            isLoggetIn.setValue(LoginState.PhoneNumberIncorrect);
        }
        //TODO execute login with phone number
        else
        {PhoneAuthProvider.getInstance().verifyPhoneNumber();}


    }
    public void checkLoginState()
    {
        isLoggetIn.setValue(auth.getCurrentUser() == null?LoginState.NotLoggedIn:LoginState.LogedIn);
    }
    private boolean checkPhoneInEditText()
    {
        String pattern="^\\d{10}";
        return phonenumber.matches(pattern);
    }






}
