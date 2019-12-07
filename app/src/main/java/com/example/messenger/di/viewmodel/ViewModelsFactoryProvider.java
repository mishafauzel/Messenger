package com.example.messenger.di.viewmodel;

import androidx.lifecycle.ViewModelProvider;

import com.example.messenger.viewmodels.ViewModelsFactory;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelsFactoryProvider {
    @Singleton
    @Binds
    public abstract ViewModelProvider.Factory bindsViewModel(ViewModelsFactory modelsFactory);
}
