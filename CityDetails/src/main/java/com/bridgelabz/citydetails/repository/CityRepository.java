package com.bridgelabz.citydetails.repository;

import com.bridgelabz.citydetails.entity.CityDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityDetails,Long> {
}
