package com.bridgelabz.citydetails.service;

import com.bridgelabz.citydetails.dto.CityDto;
import com.bridgelabz.citydetails.entity.CityDetails;

import java.util.List;

public interface CityDetailsService {
    public List<CityDetails> getCityDetails();

    public CityDetails saveCityDetails(CityDto cityDto);
}
