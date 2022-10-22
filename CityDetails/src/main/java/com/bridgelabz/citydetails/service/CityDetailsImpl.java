package com.bridgelabz.citydetails.service;

import com.bridgelabz.citydetails.dto.CityDto;
import com.bridgelabz.citydetails.entity.CityDetails;
import com.bridgelabz.citydetails.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CityDetailsImpl implements CityDetailsService{

    @Autowired
private final CityRepository repository;

    public CityDetailsImpl(CityRepository repository) {
        this.repository = repository;
    }

    public List<CityDetails> getCityDetails(){
        return repository.findAll();
    }

    @Override
    public CityDetails saveCityDetails(CityDto cityDto) {
        CityDetails cityData=null;
        cityData=new CityDetails(cityDto);
        return repository.save(cityData);
    }
}
