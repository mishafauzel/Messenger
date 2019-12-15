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
import com.example.messenger.databinding.FragmentMessagesBinding;
import com.example.messenger.messages.viewmodels.DialogViewModel;
import com.example.messenger.messages.viewmodels.MessagesViewModel;
import com.example.messenger.viewmodels.ViewModelsFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessagesFragment extends DaggerFragment {

    @Inject
    ViewModelsFactory factory;
    MessagesViewModel viewModel;
    public MessagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentMessagesBinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_messages,container,false);
        viewModel = ViewModelProviders.of(this,factory).get(MessagesViewModel.class);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

}
