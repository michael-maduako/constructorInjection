package com.spring;

public class Emp {
	//Constructor injection (Don't need setters and getters!)
	private int id=101;
	private String name="Abdul";
	private String city="Pittsburg";
	
	public Emp() {
		System.out.println("zero arg constructor");
	}
	
	public Emp(int id) {
		this.id = id;
	}


	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public Emp(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	void display() {
		System.out.println("Emp Id: "+id+"emp Name: "+name+"City: "+city);
	}
	
}
