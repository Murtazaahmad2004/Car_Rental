package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        // Initialize EditText fields and Button
        EditText cardNumber = findViewById(R.id.cno);
        EditText cardHolderName = findViewById(R.id.chn);
        TextView expiryYear = findViewById(R.id.exy);
        TextView expiryDate = findViewById(R.id.exd);

        Button btn_nxt3 = findViewById(R.id.next_button);

        btn_nxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate fields
                String cardNum = cardNumber.getText().toString().trim();
                String holderName = cardHolderName.getText().toString().trim();
                String expYear = expiryYear.getText().toString().trim();
                String expDate = expiryDate.getText().toString().trim();

                if (cardNum.isEmpty()) {
                    Toast.makeText(MainActivity6.this, "Please enter the card number", Toast.LENGTH_SHORT).show();
                } else if (holderName.isEmpty()) {
                    Toast.makeText(MainActivity6.this, "Please enter the card holder name", Toast.LENGTH_SHORT).show();
                } else if (expYear.isEmpty()) {
                    Toast.makeText(MainActivity6.this, "Please enter the expiry year", Toast.LENGTH_SHORT).show();
                } else if (expDate.isEmpty()) {
                    Toast.makeText(MainActivity6.this, "Please enter the expiry date", Toast.LENGTH_SHORT).show();
                } else {
                    // All fields are filled, proceed to the next screen
                    Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                    startActivity(intent);
                }
            }
        });
    }
}