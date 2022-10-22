package com.bridgelabz.citydetails.controller;

import com.bridgelabz.citydetails.dto.CityDto;
import com.bridgelabz.citydetails.dto.ResponseDto;
import com.bridgelabz.citydetails.entity.CityDetails;
import com.bridgelabz.citydetails.service.CityDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityDetailsController {

    @Autowired
    private CityDetailsService service;

    @GetMapping(value ={"", "/","/get"})
    public ResponseEntity<ResponseDto> getCityDetails(){
        List<CityDetails> cityDetailsList=null;
        cityDetailsList=service.getCityDetails();
        ResponseDto responseDTO=new ResponseDto("Get Call Successful",cityDetailsList);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addCityDetails(@RequestBody CityDto cityDto) {
        CityDetails cityDetails=service.saveCityDetails(cityDto);
        ResponseDto responseDTO=new ResponseDto("Created Employee payroll data successfully",cityDetails);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }
}
