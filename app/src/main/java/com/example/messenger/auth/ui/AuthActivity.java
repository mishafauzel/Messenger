package com.example.messenger.auth.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.messenger.R;

import dagger.android.DaggerActivity;
import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
