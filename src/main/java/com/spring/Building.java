package com.spring;

public class Building {
	private int buildNo;
	private String buildName;
	private Room room;
	public Building(int buildNo, String buildName, Room room) {
		super();
		this.buildNo = buildNo;
		this.buildName = buildName;
		this.room = room;
	}
	void display() {
		System.out.println("Build No "+buildNo+"\nBuild Name: "+buildName+ room);
	}
}
