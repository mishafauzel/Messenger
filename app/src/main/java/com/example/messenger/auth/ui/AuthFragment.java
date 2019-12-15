package com.example.messenger.auth.ui;


import android.content.Context;
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
    FragmentInteraction interaction;



    public AuthFragment() {
        // Required empty public constructor
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentInteraction)
        {
            interaction=(FragmentInteraction)context;
        }
        else throw new RuntimeException("Context must implement FragmentInteraction interface ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModels=ViewModelProviders.of(this,viewModelsFactiry).get(AuthViewModel.class);
        FragmentAuthBinding  binding=DataBindingUtil.inflate(inflater,R.layout.fragment_auth,container,false);
        binding.setViewModel(viewModels);
        subscribeOnLiveData();
        binding.button.setOnClickListener((view)->
        {
            viewModels.executeLogin();

        });


        // Inflate the layout for this fragment
        return binding.getRoot();
    }
    @Override
    public void onDetach() {
        super.onDetach();
        interaction=null;
    }
    public interface FragmentInteraction
    {
        //show progress bar if your login in progress
         void showProgress(boolean isShown);
         void loginComplete();
    }
    private void subscribeOnLiveData()
    {
        viewModels.getIsLoggetIn().removeObservers(this.getViewLifecycleOwner());
        viewModels.getIsLoggetIn().observe(this,(isLoggedIn)->
        {
            if(isLoggedIn)
            {
                interaction.loginComplete();
            }
            else {
                interaction.showProgress(false);
            }
        });
    }

}
