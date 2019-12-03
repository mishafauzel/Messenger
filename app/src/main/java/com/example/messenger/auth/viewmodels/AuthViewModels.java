package com.example.messenger.auth.viewmodels;

import androidx.lifecycle.ViewModel;

import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Inject;

public class AuthViewModels extends ViewModel {
    @Inject
    FirebaseAuth auth;
}
