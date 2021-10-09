package com.example.flight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineClassRepository extends JpaRepository<Airline, Integer>  {
	AirlineClass findByName(String name);
}