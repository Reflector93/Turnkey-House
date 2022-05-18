package com.example.turnkeyhouse.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.turnkeyhouse.R;
import com.example.turnkeyhouse.databinding.MainScreenLayoutBinding;

public class MainScreen extends AppCompatActivity
{
    MainScreenLayoutBinding mainBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.main_screen_layout);
    }
}
