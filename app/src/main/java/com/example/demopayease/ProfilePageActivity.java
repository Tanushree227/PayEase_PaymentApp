package com.example.demopayease;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ProfilePageActivity extends AppCompatActivity {

    TextView userText, emailText, phoneText, logoutText;

    Button addBankbtn;

    DBHandler dbHandler;

    SharedPreferences sharedPreferences;

    String user_str, email_str, phone;

    public static final String SHARED_PREFS = "login_prefs";
    public static final String USERNAME_KEY = "username_key";

    public static final String EMAIL_KEY = "email_key";
    public static final String PHONE_KEY = "phone_key";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        dbHandler = new DBHandler(this);
        userText = findViewById(R.id.userText);
        emailText = findViewById(R.id.emailText);
        phoneText = findViewById(R.id.phoneText);
        addBankbtn = findViewById(R.id.addBankbtn);
        logoutText = findViewById(R.id.logout);


        sharedPreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        user_str = sharedPreferences.getString(USERNAME_KEY, "");
        email_str = sharedPreferences.getString(EMAIL_KEY, "");
        phone = sharedPreferences.getString(PHONE_KEY, "");

        userText.setText("Username: "+user_str);
        emailText.setText("Email: " +email_str);
        phoneText.setText("Phone: " +phone);

        addBankbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(ProfilePageActivity.this, AddBankActivity.class);
                startActivity(i1);
            }
        });

        ImageButton backP = (ImageButton) findViewById(R.id.backprofilebtn);
        backP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        logoutText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(ProfilePageActivity.this, MainActivity.class);
                finish();
                startActivity(i1);
            }
        });
    }
}