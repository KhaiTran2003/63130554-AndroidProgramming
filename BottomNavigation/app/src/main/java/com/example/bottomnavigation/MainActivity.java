package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bottomnavigation.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            return true;
        });
    }
}