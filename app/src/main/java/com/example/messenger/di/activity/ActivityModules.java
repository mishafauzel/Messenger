package com.example.messenger.di.activity;

import com.example.messenger.auth.ui.AuthActivity;
import com.example.messenger.di.fragments.auth.AuthViewModelModule;
import com.example.messenger.di.fragments.auth.FragmentsModule;
import com.example.messenger.di.fragments.messages.FragmentModule.MessagesFragmentModule;
import com.example.messenger.di.fragments.messages.FragmentModule.MessagesViewModelModule;
import com.example.messenger.messages.ui.MessagesActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
@Module
public abstract class ActivityModules {
    @ContributesAndroidInjector(modules = {FragmentsModule.class, AuthViewModelModule.class})
    public abstract AuthActivity contributeAuthActivity();
    @ContributesAndroidInjector(modules = {MessagesFragmentModule.class, MessagesViewModelModule.class})
    public abstract MessagesActivity contributeMessageActivity();
}
