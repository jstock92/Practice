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

	public String toString()
	{
		System.out.println(this.color);
		System.out.println(this.year);
		System.out.println(this.speed);
		System.out.println(this.model);
	    return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	

	
}
