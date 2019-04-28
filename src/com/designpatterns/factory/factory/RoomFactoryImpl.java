package com.designpatterns.factory.factory;

import java.util.ArrayList;
import java.util.List;

import com.designpatterns.factory.entity.Room;

/*
 * Factory Design pattern allows to have a factory class that takes care of creating 
 * an object of perticular type. 
 * Additionally (not necessary) it can also take some configuration 
 * here I am using simple enums, but it could any param.
 * 
 * Pulling out the creation of object allows client to focus on main logic and also not repeating code 
 * 
 */

public class RoomFactoryImpl extends RoomFactory {

	@Override
	public Room getRoom(RoomType roomtype) {
		switch (roomtype) {
		case BASICROOM:
			return getBasicRoom();
		case SUITROOM:
			return getSuitRoom();
		case LARGEROOM:
			return getLargeRoom();
		default:
			break;
		}
		return null;
	}

	private Room getBasicRoom() {
		Room room = new Room();
		List<String> aminities = new ArrayList<String>();
		aminities.add("King size Room");
		aminities.add("Basic Bathroom");
		room.setAmenities(aminities);
		room.setRooms(1);
		return room;
	}

	private Room getSuitRoom() {
		Room room = getBasicRoom();
		List<String> aminities = room.getAmenities();
		aminities.add("swimming pool");
		aminities.add("dining table");
		return room;
	}

	private Room getLargeRoom() {
		Room room = getBasicRoom();
		room.setRooms(2);
		return room;
	}
}
