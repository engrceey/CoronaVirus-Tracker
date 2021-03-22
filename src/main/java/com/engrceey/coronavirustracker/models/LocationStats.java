package com.engrceey.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCate;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCate() {
        return latestTotalCate;
    }

    public void setLatestTotalCate(int latestTotalCate) {
        this.latestTotalCate = latestTotalCate;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCate=" + latestTotalCate +
                '}';
    }
}
