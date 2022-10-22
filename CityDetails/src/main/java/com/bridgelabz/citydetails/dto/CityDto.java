package com.bridgelabz.citydetails.dto;

public class CityDto {
    public String country;

    public String city;

    public int rankInArea;

    public String continent;

    @Override
    public String toString() {
        return "CityDto{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", rankInArea=" + rankInArea +
                ", continent='" + continent + '\'' +
                '}';
    }
}
