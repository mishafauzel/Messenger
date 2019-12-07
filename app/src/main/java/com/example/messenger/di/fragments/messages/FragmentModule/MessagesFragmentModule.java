package com.example.messenger.di.fragments.messages.FragmentModule;

import com.example.messenger.messages.ui.fragments.DialogFragment;
import com.example.messenger.messages.ui.fragments.MessagesFragment;
import com.example.messenger.messages.ui.fragments.UsersFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MessagesFragmentModule {
    @ContributesAndroidInjector
    public abstract DialogFragment contributeDialogFragment();
    @ContributesAndroidInjector
    public abstract MessagesFragment contributeMessagesFragment();
    @ContributesAndroidInjector
    public abstract UsersFragment contributeUsersFragment();
}
