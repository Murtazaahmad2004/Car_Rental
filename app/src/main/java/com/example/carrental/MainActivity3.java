package com.example.carrental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Initialize ListView and car list
        ListView listView = findViewById(R.id.listView);

        List<car> carList = new ArrayList<>();
        carList.add(new car(R.drawable.honda, "Honda Civic", "5500 per day with Fuel & Driver", "4500 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.toyota, "Toyota Corolla", "4000 per day with Fuel & Driver", "3000 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.prado, "Land Cruiser Prado", "20000 per day with Fuel & Driver", "18000 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.kia, "Kia Sportage", "15000 per day with Fuel & Driver", "13000 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.revo, "Toyota Revo(4x4)", "30000 per day with Fuel & Driver", "25000 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.v8, "Toyota V8", "35000 per day with Fuel & Driver", "27500 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.vigo, "Toyota Vigo(4x4)", "32500 per day with Fuel & Driver", "28000 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.yaris, "Toyota Yaris", "9000 per day with Fuel & Driver", "8500 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.honda1, "Honda Civic", "7500 per day with Fuel & Driver", "7000 per day without Fuel & Driver"));
        carList.add(new car(R.drawable.alts, "Toyota Altis", "7000 per day with Fuel & Driver", "6000 per day without Fuel & Driver"));

        // Set up the adapter
        CarAdapter adapter = new CarAdapter(this, carList);
        listView.setAdapter(adapter);

        // Set item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("carName", carList.get(position).getName());
                intent.putExtra("carPriceWithDriver", carList.get(position).getPriceWithDriver());
                intent.putExtra("carPriceWithoutDriver", carList.get(position).getPriceWithoutDriver());
                startActivity(intent);
            }
        });
    }
}