package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        // Initialize RadioGroup
        RadioGroup radioGroup = findViewById(R.id.radio_group);

        // Handle button click
        Button nxt_btn = findViewById(R.id.nxt_btn);
        nxt_btn.setOnClickListener(v -> {
            // Check which radio button is selected
            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                // No radio button is selected
                Toast.makeText(MainActivity5.this, "Please select a payment option", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent;

                // Determine which screen to open based on selected option
                if (selectedId == R.id.dbcd) {
                    // Open screen for Debit Card
                    intent = new Intent(MainActivity5.this, MainActivity6.class);
                } else if (selectedId == R.id.esp) {
                    // Open screen for Easypaisa
                    intent = new Intent(MainActivity5.this, MainActivity7.class);
                } else if (selectedId == R.id.cod) {
                    // Open screen for Cash on Delivery
                    intent = new Intent(MainActivity5.this, MainActivity8.class);
                } else {
                    // Fallback (should not happen if all cases are handled)
                    Toast.makeText(MainActivity5.this, "Invalid selection", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Start the appropriate activity
                startActivity(intent);
            }
        });
    }
}