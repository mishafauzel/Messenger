package com.example.messenger.di.fragments.auth;

import androidx.lifecycle.ViewModel;

import com.example.messenger.auth.viewmodels.AuthViewModel;
import com.example.messenger.di.viewmodel.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {
@Binds
@IntoMap
@ViewModelKey(AuthViewModel.class)
public abstract ViewModel bindAuthViewModel(AuthViewModel model);
}
