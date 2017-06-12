package com.person;

public class Person {
	
	private String name; // Private variable be careful
	
	public Person (String n){
		super();
		this.name = n;
		//this.name = n;
		//System.out.print("#1 ");

	}
	
	public Person (){
		//this.name = n;
		//System.out.print("#1 ");
	}
	
	public void setName (String n){
		
		this.name = n;
		System.out.print(n);
	}
}
