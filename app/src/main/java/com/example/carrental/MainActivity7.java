package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        // Initialize EditText fields and Button
        EditText easyNumField = findViewById(R.id.easynum);  // Easypaisa number input field
        EditText gmailField = findViewById(R.id.gmail);      // Gmail input field

        Button btn_nxt3 = findViewById(R.id.next_button);

        btn_nxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user input values
                String easyNum = easyNumField.getText().toString().trim();
                String gmail = gmailField.getText().toString().trim();

                // Validate inputs
                if (easyNum.isEmpty()) {
                    Toast.makeText(MainActivity7.this, "Please enter the Easypaisa number", Toast.LENGTH_SHORT).show();
                } else if (gmail.isEmpty()) {
                    Toast.makeText(MainActivity7.this, "Please enter the Gmail address", Toast.LENGTH_SHORT).show();
                } else {
                    // If all fields are filled, proceed to the next screen
                    Intent intent = new Intent(MainActivity7.this, MainActivity9.class);
                    startActivity(intent);
                }
            }
        });
    }
}