package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);

        // Initialize EditText fields and Button
        EditText nameField = findViewById(R.id.your_name); // For entering name
        EditText mobileField = findViewById(R.id.mobileno); // For entering mobile number
        EditText idCardField = findViewById(R.id.idno); // For entering ID card number
        Button btnNext = findViewById(R.id.next_button);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve input values
                String name = nameField.getText().toString().trim();
                String mobile = mobileField.getText().toString().trim();
                String idCard = idCardField.getText().toString().trim();

                // Validation checks
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity8.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                } else if (mobile.isEmpty()) {
                    Toast.makeText(MainActivity8.this, "Please enter your mobile number", Toast.LENGTH_SHORT).show();
                } else if (idCard.isEmpty()) {
                    Toast.makeText(MainActivity8.this, "Please enter your ID card number", Toast.LENGTH_SHORT).show();
                } else {
                    // All fields are valid, proceed to the next screen
                    Intent intent = new Intent(MainActivity8.this, MainActivity9.class); // Replace with the actual next activity
                    startActivity(intent);
                }
            }
        });
    }
}