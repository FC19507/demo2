package com.example.flight;

public class AirlineNotFoundException extends RuntimeException {
AirlineNotFoundException(String message){
	super(message);
}
}