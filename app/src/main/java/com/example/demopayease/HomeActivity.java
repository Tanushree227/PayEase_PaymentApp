package com.example.demopayease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView to_phone = (ImageView) findViewById(R.id.tophone);
        ImageView to_contact = (ImageView) findViewById(R.id.tocontact);
        ImageView to_bank = (ImageView) findViewById(R.id.tobank);
        ImageButton menu = (ImageButton) findViewById(R.id.menu);
        ImageView digitalwallet = (ImageButton) findViewById(R.id.digitalwallet);
        ImageView balance_history = (ImageView) findViewById(R.id.balance);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ProfilePageActivity.class);
                startActivity(intent);
            }
        });

        to_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(HomeActivity.this, ToPhoneActivity.class);
                startActivity(i1);
            }
        });

        to_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(HomeActivity.this, ToContactActivity.class);
                startActivity(i2);
            }
        });

        to_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(HomeActivity.this, ToBankActivity.class);
                startActivity(i3);
            }
        });

        digitalwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(HomeActivity.this, DigitalWalletActivity.class);
                startActivity(i4);
            }
        });

        balance_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(HomeActivity.this, Balance_History_Activity.class);
                startActivity(i5);
            }
        });
    }
}