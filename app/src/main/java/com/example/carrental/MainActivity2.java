package com.example.carrental;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // References to the UI elements
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        EditText pickupLocationField = findViewById(R.id.pickup_location); // Fixed
        Button pickupDateField = findViewById(R.id.pickup_date);          // Fixed
        EditText dropoffLocationField = findViewById(R.id.dropoff_location); // Fixed
        Button dropoffDateField = findViewById(R.id.dropoff_date);        // Fixed
        Button findCarButton = findViewById(R.id.find_car_button);        // Add a button for "Find Car"

        // Listener for RadioGroup changes
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radio_dropoff) {
                dropoffLocationField.setVisibility(View.VISIBLE);
                dropoffDateField.setVisibility(View.VISIBLE);
            } else if (checkedId == R.id.radio_pickup) {
                dropoffLocationField.setVisibility(View.GONE);
                dropoffDateField.setVisibility(View.GONE);
            }
        });

        // Pickup Date picker
        pickupDateField.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            new DatePickerDialog(MainActivity2.this, (datePicker, i, i1, i2) -> pickupDateField.setText(MessageFormat.format("{0}/{1}/{2}", i2, i1 + 1, i)), year, month, day).show();
        });

        // Drop-off Date picker
        dropoffDateField.setOnClickListener(view -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            new DatePickerDialog(MainActivity2.this, (datePicker, i, i1, i2) -> dropoffDateField.setText(MessageFormat.format("{0}/{1}/{2}", i2, i1 + 1, i)), year, month, day).show();
        });

        // Find Car button click listener
        findCarButton.setOnClickListener(view -> {
            String pickupLocation = pickupLocationField.getText().toString().trim();
            String pickupDate = pickupDateField.getText().toString().trim();
            String dropoffLocation = dropoffLocationField.getText().toString().trim();
            String dropoffDate = dropoffDateField.getText().toString().trim();
            int selectedId = radioGroup.getCheckedRadioButtonId();

            // Validation for Pickup Location and Date
            if (pickupLocation.isEmpty() || pickupDate.isEmpty()) {
                Toast.makeText(MainActivity2.this, "Please enter Pickup Location and Date", Toast.LENGTH_SHORT).show();
                return;
            }

            // Validation for Drop-off details if Drop-off option is selected
            if (selectedId == R.id.radio_dropoff) {
                if (dropoffLocation.isEmpty() || dropoffDate.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please enter Drop-off Location and Date", Toast.LENGTH_SHORT).show();
                    return;
                }
            }

            // Navigate to the next screen
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("pickup_location", pickupLocation);
            intent.putExtra("pickup_date", pickupDate);
            if (selectedId == R.id.radio_dropoff) {
                intent.putExtra("dropoff_location", dropoffLocation);
                intent.putExtra("dropoff_date", dropoffDate);
            }
            startActivity(intent);
        });
    }
}