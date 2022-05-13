package com.example.turnkeyhouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;

import com.example.turnkeyhouse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainBinding.loginButton.getBackground().setColorFilter( new PorterDuffColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY) );
        mainBinding.signUpButton.getBackground().setColorFilter( new PorterDuffColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY) );
    }
}