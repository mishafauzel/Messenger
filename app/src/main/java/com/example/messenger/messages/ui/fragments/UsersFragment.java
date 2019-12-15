package com.example.messenger.messages.ui.fragments;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.messenger.R;
import com.example.messenger.databinding.FragmentDialogBinding;
import com.example.messenger.databinding.FragmentUsersBinding;
import com.example.messenger.messages.viewmodels.DialogViewModel;
import com.example.messenger.messages.viewmodels.UsersViewModel;
import com.example.messenger.viewmodels.ViewModelsFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsersFragment extends DaggerFragment {

    @Inject
    ViewModelsFactory factory;
    UsersViewModel viewModel;
    public UsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentUsersBinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_users,container,false);
        viewModel = ViewModelProviders.of(this,factory).get(UsersViewModel.class);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

}
