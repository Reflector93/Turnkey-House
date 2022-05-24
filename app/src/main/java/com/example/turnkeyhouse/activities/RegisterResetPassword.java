package com.example.turnkeyhouse.activities;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.turnkeyhouse.R;
import com.example.turnkeyhouse.databinding.RegisterResetPassLayoutBinding;

public class RegisterResetPassword extends AppCompatActivity
{
    private RegisterResetPassLayoutBinding mainBinding;
    private boolean isRegisterMode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.register_reset_pass_layout);

        isRegisterMode = getIntent().getBooleanExtra("signUp", true);

        if( !isRegisterMode )
        {
            mainBinding.title.setText( getString(R.string.reset_pass_title) );
            mainBinding.loginButton.setVisibility(View.GONE);
        }

        mainBinding.confirmButton.getBackground().setColorFilter( new PorterDuffColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY) );
        mainBinding.loginButton.getBackground().setColorFilter( new PorterDuffColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY) );
    }
}
