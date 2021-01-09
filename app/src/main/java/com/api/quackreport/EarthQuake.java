package com.api.quackreport;

public class EarthQuake {
    private String city;
    private double magnitude;
    private long timeinmilisec;

    public EarthQuake(String city, double magnitude, long timeinmilisec) {
        this.city = city;
        this.magnitude = magnitude;
        this.timeinmilisec = timeinmilisec;
    }

    public long getTimeinmilisec() {
        return timeinmilisec;
    }

    public void setTimeinmilisec(long timeinmilisec) {
        this.timeinmilisec = timeinmilisec;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

}
