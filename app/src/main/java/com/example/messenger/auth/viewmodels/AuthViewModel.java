package com.example.messenger.auth.viewmodels;

import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;

import com.example.messenger.R;
import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    @Inject
    FirebaseAuth auth;
    public String code;
    public String phonenumber;
    private NavController navController;
    @Inject
    public AuthViewModel(FirebaseAuth auth) {
        this.auth = auth;
    }

    public void executeLogin()
    {
        //TODO execute login
        navController.navigate(R.id.action_authFragmentFragment_to_messagesActivity);
    }

    public void setNavController(NavController navController) {
        this.navController=navController;
    }
}
