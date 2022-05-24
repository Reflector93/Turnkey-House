package com.example.turnkeyhouse.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;

import com.example.turnkeyhouse.R;
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

    @Override
    protected void onStart()
    {
        mainBinding.loginButton.setOnClickListener(v ->
        {
            Intent intent = new Intent(mainBinding.getRoot().getContext(), MainScreen.class);
            startActivity(intent);
        });

        mainBinding.signUpButton.setOnClickListener(v ->
        {
            Intent intent = new Intent(mainBinding.getRoot().getContext(), RegisterResetPassword.class);
            startActivity(intent);
        });

        mainBinding.resetPassword.setOnClickListener(v ->
        {
            Intent intent = new Intent(mainBinding.getRoot().getContext(), RegisterResetPassword.class);
            intent.putExtra("signUp", false);
            startActivity(intent);
        });

        super.onStart();
    }
}