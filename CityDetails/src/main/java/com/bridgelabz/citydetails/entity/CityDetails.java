package com.bridgelabz.citydetails.entity;

import com.bridgelabz.citydetails.dto.CityDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public @Data class CityDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public String country;
    public String city;

    public int rankInArea;

    public String continent;

    public CityDetails(CityDto cityDto) {
        this.country =cityDto.country;
        this.city = cityDto.city;
        this.rankInArea = cityDto.rankInArea;
        this.continent = cityDto.continent;
    }
}
