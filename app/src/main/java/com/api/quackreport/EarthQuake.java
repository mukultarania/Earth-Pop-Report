package com.api.quackreport;

public class EarthQuake {
    private String city;
    private double magnitude;
    private long timeinmilisec;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EarthQuake(String city, double magnitude, long timeinmilisec, String url) {
        this.city = city;
        this.magnitude = magnitude;
        this.timeinmilisec = timeinmilisec;
        this.url = url;
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
