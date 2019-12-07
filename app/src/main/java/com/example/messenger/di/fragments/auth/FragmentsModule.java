package com.example.messenger.di.fragments.auth;

import com.example.messenger.auth.ui.AuthFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsModule {
    @ContributesAndroidInjector
    public abstract AuthFragment contributeAuthFragment();
}
