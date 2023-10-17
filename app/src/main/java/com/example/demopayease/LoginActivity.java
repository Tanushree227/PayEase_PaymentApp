package com.example.demopayease;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {
    public static final String SHARED_PREFS = "login_prefs";
    public static final String USERNAME_KEY = "username_key";
    public static final String PASSWORD_KEY = "password_key";

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);

        EditText uname = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        MaterialButton loginBtn = findViewById(R.id.loginbtn);



        DBHandler dbHandler = new DBHandler(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unameText = uname.getText().toString();
                String passText = pass.getText().toString();
                if(unameText.isEmpty() || passText.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Please enter all the fields.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    sharedPreferences.edit().putString(USERNAME_KEY, unameText).apply();
                    sharedPreferences.edit().putString(PASSWORD_KEY, passText).apply();
                    Log.d("Username", "Username"+unameText+"Password"+passText);

                    //if(loggedIn) {
                        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                        finish();
                        startActivity(i);
                    //}
                    /**else
                    {
                        Toast.makeText(LoginActivity.this, "User do not Exist, Create a Account First.", Toast.LENGTH_SHORT).show();
                    }**/
                }
            }
        });

        ImageButton backbtn = (ImageButton) findViewById(R.id.backBtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}