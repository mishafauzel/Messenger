package com.example.messenger.auth.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.messenger.R;
import com.example.messenger.databinding.ActivityAuthBinding;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity implements AuthFragment.FragmentInteraction {
    private NavController navController;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAuthBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_auth);
        navController = Navigation.findNavController(this,R.id.nav_frag);
        progressBar = binding.progressBar;
    }

    @Override
    public void showProgress(boolean isShown) {
        int progressVisbility = isShown? View.VISIBLE:View.GONE;
        progressBar.setVisibility(progressVisbility);
    }

    @Override
    public void loginComplete() {
        navController.navigate(R.id.action_authFragmentFragment_to_messagesActivity);

    }
}
