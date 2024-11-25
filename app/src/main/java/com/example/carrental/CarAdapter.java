package com.example.carrental;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CarAdapter extends BaseAdapter {

    private final Context context;
    private final List<car> carList;

    public CarAdapter(Context context, List<car> carList) {
        this.context = context;
        this.carList = carList;
    }

    @Override
    public int getCount() {
        return carList.size();
    }

    @Override
    public Object getItem(int position) {
        return carList;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        car car = carList.get(position);

        ImageView carImage = convertView.findViewById(R.id.carImage);
        TextView carTitle = convertView.findViewById(R.id.carTitle);
        TextView withFuelDriverPrice = convertView.findViewById(R.id.withFuelDriverPrice);
        TextView withoutFuelDriverPrice = convertView.findViewById(R.id.withoutFuelDriverPrice);

        carImage.setImageResource(car.getImageResource());
        carTitle.setText(car.getTitle());
        withFuelDriverPrice.setText(car.getWithFuelDriverPrice());
        withoutFuelDriverPrice.setText(car.getWithoutFuelDriverPrice());

        return convertView;
    }
}
