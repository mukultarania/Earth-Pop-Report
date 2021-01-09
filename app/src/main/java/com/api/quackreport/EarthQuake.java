package com.api.quackreport;

public class EarthQuake {
    private String city;
    private String date;
    private double magnitude;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public EarthQuake(String city, String date, double magnitude) {
        this.city = city;
        this.date = date;
        this.magnitude = magnitude;
    }
}
