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
import com.example.messenger.messages.viewmodels.DialogViewModel;
import com.example.messenger.viewmodels.ViewModelsFactory;

import javax.inject.Inject;

import dagger.android.DaggerService;
import dagger.android.support.DaggerFragment;

public class DialogFragment extends DaggerFragment {
    @Inject
    ViewModelsFactory factory;
    DialogViewModel viewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentDialogBinding binding=DataBindingUtil.inflate(inflater,R.layout.fragment_dialog,container,false);
        viewModel =ViewModelProviders.of(this,factory).get(DialogViewModel.class);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }


}
