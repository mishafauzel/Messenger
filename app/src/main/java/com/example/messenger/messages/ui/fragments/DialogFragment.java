package com.example.messenger.messages.ui.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.messenger.R;
import com.example.messenger.messages.ViewModels.DialogViewModel;
import com.example.messenger.viewmodels.ViewModelsFactory;

import javax.inject.Inject;

public class DialogFragment extends Fragment {
    @Inject
    ViewModelsFactory factory;
    DialogViewModel viewModek;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_dialog, container, false);
    }


}
