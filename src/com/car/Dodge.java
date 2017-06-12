package com.car;

/* 
 * 
 * Created a class which extends from Car and adds the model of the Dodge and if a hemi
 * Also overrides the maximum speed
 * 
*/

public class Dodge extends Car{
	
	String model;
	boolean hemi;
	
	public Dodge (String color, int year, boolean hemi)
    {
		super(color, year);
		this.model = "Charger";
		this.hemi = hemi;
		
	}

	@Override 
	double getMaxSpeed(){
		return 200;
		
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
