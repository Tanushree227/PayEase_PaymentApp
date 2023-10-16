package com.example.demopayease;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ProfilePageActivity extends AppCompatActivity {

    TextView userText, emailText, phoneText;

    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        dbHandler = new DBHandler(this);
        userText = findViewById(R.id.userText);
        emailText = findViewById(R.id.emailText);
        phoneText = findViewById(R.id.phoneText);

        ImageButton backP = (ImageButton) findViewById(R.id.backprofilebtn);
        backP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}