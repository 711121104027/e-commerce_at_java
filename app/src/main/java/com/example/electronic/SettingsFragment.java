package com.example.electronic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment implements View.OnClickListener {

    private Button settingsButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        // Initialize the settings button
        settingsButton = view.findViewById(R.id.settingsButton);

        // Set the click listener for the settings button
        settingsButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        // Handle the settings button click
        if (v.getId() == R.id.settingsButton) {
            openSettingsActivity();
        }
    }

    private void openSettingsActivity() {
        // Start the settings activity
        Intent intent = new Intent(getActivity(), SettingsActivity.class);
        startActivity(intent);
    }
}
