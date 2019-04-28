package com.designpatterns.factory.entity;

import java.util.List;

public class Room {
	
	private List<String> amenities;
	private int rooms;
	
	public Room() {
		
	}
	
	public List<String> getAmenities() {
		return amenities;
	}
	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Room [amenities=" + amenities + ", rooms=" + rooms + "]";
	}
	
	
	
	
	

}
