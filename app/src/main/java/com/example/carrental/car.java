package com.example.carrental;

public class car {
    private int imageResource;
    private String title;
    private String withFuelDriverPrice;
    private String withoutFuelDriverPrice;

    public car(int imageResource, String title, String withFuelDriverPrice, String withoutFuelDriverPrice) {
        this.imageResource = imageResource;
        this.title = title;
        this.withFuelDriverPrice = withFuelDriverPrice;
        this.withoutFuelDriverPrice = withoutFuelDriverPrice;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getWithFuelDriverPrice() {
        return withFuelDriverPrice;
    }

    public String getWithoutFuelDriverPrice() {
        return withoutFuelDriverPrice;
    }

    public boolean getName() {
        return true;
    }

    public boolean getPriceWithDriver() {
        return false;
    }

    public boolean getPriceWithoutDriver() {
        return false;
    }
}