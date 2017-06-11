package com.car;

/* 
 * 
 * Created an abstract class with variables and functions defining the color, year, and max speed of the car
 * 
 * 
*/
abstract public class Car {
	String color;
	int year;
	double speed = getMaxSpeed();
	
	public Car (String color, int year){
		
		this.color =  color;
		this.year = year;
		this.speed = speed;

		
	}
	
	double getMaxSpeed(){
		return 130;
		
	}
	
	
	

	
}