package com.example.messenger.auth.ui;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.messenger.R;
import com.example.messenger.auth.viewmodels.AuthViewModel;
import com.example.messenger.databinding.FragmentAuthBinding;
import com.example.messenger.viewmodels.ViewModelsFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

import static androidx.databinding.DataBindingUtil.inflate;

/**
 * A simple {@link Fragment} subclass.
 */
public class AuthFragment extends DaggerFragment {

    @Inject
    ViewModelsFactory viewModelsFactiry;
    AuthViewModel viewModels;

    public AuthFragment() {
        // Required empty public constructor
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        viewModels.setNavController(null);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModels=ViewModelProviders.of(this,viewModelsFactiry).get(AuthViewModel.class);
        FragmentAuthBinding  binding=DataBindingUtil.inflate(inflater,R.layout.fragment_auth,container,false);
        binding.setViewModel(viewModels);
        NavController navController=Navigation.findNavController(binding.getRoot());
        viewModels.setNavController(navController);

        // Inflate the layout for this fragment
        return binding.getRoot();
    }

}
