package com.bean;

public class Travel implements Journey {
	private Vehicle v;
	
	public void startJourney()
	{
		System.out.println("Journey started.....!");
		v.move();
	}
	public void setV(Vehicle v)
	{
		this.v=v;
	}
}
