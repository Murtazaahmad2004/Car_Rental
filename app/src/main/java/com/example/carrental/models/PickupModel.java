package com.example.carrental.models;

public class PickupModel {
    private String pickup_date;
    private String pickup_loc;
    private String dropoff_loc;

    public PickupModel(String pickupDate, String pickupLoc, String dropoffLoc, String dropoffDate) {
    }

    public String getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(String pickup_date) {
        this.pickup_date = pickup_date;
    }

    public String getPickup_loc() {
        return pickup_loc;
    }

    public void setPickup_loc(String pickup_loc) {
        this.pickup_loc = pickup_loc;
    }

    public String getDropoff_loc() {
        return dropoff_loc;
    }

    public void setDropoff_loc(String dropoff_loc) {
        this.dropoff_loc = dropoff_loc;
    }

    public PickupModel() {
        this(null, null, null);
    }

    public PickupModel(String pickup_date, String pickup_loc, String dropoff_loc) {
        this.pickup_date = pickup_date;
        this.pickup_loc = pickup_loc;
        this.dropoff_loc = dropoff_loc;
    }
}
