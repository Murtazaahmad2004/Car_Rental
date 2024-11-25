package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        // Initialize fields
        EditText fname = findViewById(R.id.fname);
        EditText lname = findViewById(R.id.lname);
        EditText age = findViewById(R.id.age);

        RadioGroup radioGroup = findViewById(R.id.radio_group);
        findViewById(R.id.radio_driver); // Fixed
        findViewById(R.id.radio_fule);   // Add a button for "Find Car"

        // Listener for RadioGroup changes
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radio_driver) {
                // Do something if required
            } else if (checkedId == R.id.radio_fule) {
                // Do something if required
            }
        });

        Button nxt_btn = findViewById(R.id.nxt_btn);
        nxt_btn.setOnClickListener(v -> {
            // Get input from fields
            String firstName = fname.getText().toString().trim();
            String lastName = lname.getText().toString().trim();
            String ageText = age.getText().toString().trim();

            // Validate fields
            if (firstName.isEmpty()) {
                Toast.makeText(MainActivity4.this, "First name is required", Toast.LENGTH_SHORT).show();
                return; // Stop further execution
            }

            if (lastName.isEmpty()) {
                Toast.makeText(MainActivity4.this, "Last name is required", Toast.LENGTH_SHORT).show();
                return;
            }

            if (ageText.isEmpty()) {
                Toast.makeText(MainActivity4.this, "Age is required", Toast.LENGTH_SHORT).show();
                return;
            }

            // Proceed to next screen if all fields are filled
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
    }
}