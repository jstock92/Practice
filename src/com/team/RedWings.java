package com.team;

public class RedWings extends Team {
	
	int numPlayers = 16;
	String city = "Detroit";
	int salaryCap = 70959643;
	String logo = "Wing";
	
	public RedWings(String sport, int numPlayers, String city, int salaryCap, String logo){
		
		super(sport, numPlayers, city, salaryCap, logo);
		this.numPlayers = numPlayers;
		this.city = city;
		this.salaryCap = salaryCap;
		this.logo = logo;
		
	}
	
	public RedWings(){
		
		this.numPlayers = numPlayers;
		this.city = city;
		this.salaryCap = salaryCap;
		this.logo = logo;
		
	}
	
	public String toString()
	{
		System.out.println(this.sport);
		System.out.println(this.numPlayers);
		System.out.println(this.city);
		System.out.println(this.salaryCap);
		System.out.println(this.logo);
	    return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

}