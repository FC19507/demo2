package com.example.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AirlineClassService {
	@Autowired
	AirlineClassRepository repository;
	
	Airline addAirline(Airline airline) {
		return repository.save(airline);
	}
}