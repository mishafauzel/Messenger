package com.example.messenger.di.fragments.messages.FragmentModule;

import androidx.lifecycle.ViewModel;

import com.example.messenger.di.viewmodel.ViewModelKey;
import com.example.messenger.messages.viewmodels.DialogViewModel;
import com.example.messenger.messages.viewmodels.MessagesViewModel;
import com.example.messenger.messages.viewmodels.UsersViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
@Module
public abstract class MessagesViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(DialogViewModel.class)
    public abstract ViewModel bindDialogViewModel(DialogViewModel model);
    @Binds
    @IntoMap
    @ViewModelKey(MessagesViewModel.class)
    public abstract ViewModel  bindMessagesViewModel(MessagesViewModel model);
    @Binds
    @IntoMap
    @ViewModelKey(UsersViewModel.class)
    public abstract ViewModel bindUsersViewModel(UsersViewModel model);
}
