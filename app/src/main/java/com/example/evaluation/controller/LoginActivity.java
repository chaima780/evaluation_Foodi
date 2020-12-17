package com.example.evaluation.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.evaluation.Constants;
import com.example.evaluation.R;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextInputLayout editEmail;
        TextInputLayout editPass;
        Button btnConnect ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editEmail = (TextInputLayout) findViewById(R.id.edit_email);
        editPass = (TextInputLayout)findViewById(R.id.edit_pass);
        btnConnect = findViewById(R.id.connect_btn);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getEditText().getText().toString();
                String passWord = editPass.getEditText().getText().toString();
                if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(passWord)&& Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(getApplicationContext(), Constants.VALID_INPUTS,Toast.LENGTH_SHORT).show();
                    Intent intentHome = new Intent (LoginActivity.this, HomeActivity.class);
                    startActivity(intentHome);
                }
                else
                    Toast.makeText(getApplicationContext(), Constants.VERIFY_INPUTS,Toast.LENGTH_SHORT).show();


            }
        });

    }
}
