package com.example.demopayease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddBankActivity extends AppCompatActivity {

    EditText bankName, BankaccNum, ifscC, holderName, upiPin, balanceAmt;
    Button addbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bank);

        DBHandler dbHandler = new DBHandler(this);

        bankName = findViewById(R.id.bankName);
        BankaccNum = findViewById(R.id.BankaccNum);
        ifscC = findViewById(R.id.ifscC);
        holderName = findViewById(R.id.holderName);
        upiPin = findViewById(R.id.upiPin);
        balanceAmt = findViewById(R.id.balanceAmt);
        addbtn = findViewById(R.id.addbtn);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankName1 = bankName.getText().toString();
                String bankAccName1 = holderName.getText().toString();
                String bankAccNum = BankaccNum.getText().toString();
                String upiPin1 = upiPin.getText().toString();
                String ifscCode1 = ifscC.getText().toString();
                String balance1 = balanceAmt.getText().toString();

                if(bankName1.isEmpty() && bankAccName1.isEmpty() && bankAccNum.isEmpty() && upiPin1.isEmpty() && ifscCode1.isEmpty() && balance1.isEmpty())
                {
                    Toast.makeText(AddBankActivity.this, "Please enter all the required fields.",Toast.LENGTH_SHORT).show();
                }
                else {
                    dbHandler.addBankDetails(bankAccNum, bankAccName1, bankName1, upiPin1, ifscCode1, balance1);
                    Toast.makeText(AddBankActivity.this, "Bank Details successfully added.",Toast.LENGTH_SHORT).show();
                    BankaccNum.setText("");
                    bankName.setText("");
                    ifscC.setText("");
                    holderName.setText("");
                    upiPin.setText("");
                    balanceAmt.setText("");

                    Intent intent = new Intent(AddBankActivity.this, ProfilePageActivity.class);
                    finish();
                    startActivity(intent);
                }
            }
        });

        ImageButton backbtnBank = (ImageButton) findViewById(R.id.backbtnBank);
        backbtnBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}