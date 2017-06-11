package com.car;

/* 
 * 
 * Created a class which extends from Car and adds the model of the Ford 
 * 
 * 
*/

public class Ford extends Car{
	
	String model;
	
	public Ford (String color, int year){
		super(color, year);
		this.model = "F150";
		
	}

}
