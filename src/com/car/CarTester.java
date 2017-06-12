package com.car;

/* 
 * 
 * Class to test the objects being made
 * 
 * 
*/

public class CarTester
{
public static void main (String args[])
{
	System.out.println("\"Hello, I'm CarTester!\"");
	System.out.println();
	
	// Create a Dodge
	Dodge car1 = new Dodge("red", 2017, true);
	System.out.println(car1);
	
	// Check if the Dodge is a Charger
	if (car1.model == "Charger")
	{
		System.out.println("Charger!");
		
		if (car1.hemi == true){
			System.out.println("With a Hemi!");
		}
		
		else{
			System.out.println("No Hemi! :(");
		}
	}
	
	else{
		System.out.println("Not a Charger!");
	}
	
	System.out.println();
	
	// Create a Ford
	Ford car2 = new Ford("blue", 2009);
	System.out.println(car2.color);
	System.out.println(car2.year);
	System.out.println(car2.speed);
	System.out.println(car2.model);
	
}

}