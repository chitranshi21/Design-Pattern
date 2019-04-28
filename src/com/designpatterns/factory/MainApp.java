package com.designpatterns.factory;

import com.designpatterns.factory.entity.Room;
import com.designpatterns.factory.factory.RoomFactory;
import com.designpatterns.factory.factory.RoomFactoryImpl;
import com.designpatterns.factory.factory.RoomType;

/**
 * The factory class provides the Room Object
 * based on the configuration without letting the client worry about how to create.
 * BTW there can be more than one factory implementations, which can be swapped when used
 * 
 * @author shubhamchitranshi
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// get Factory
		RoomFactory roomFactory = new RoomFactoryImpl();
		
		// create one BasicRoom 
		Room basicRoom = roomFactory.getRoom(RoomType.BASICROOM);
		// create one SuitRoom
		Room suitRoom = roomFactory.getRoom(RoomType.SUITROOM);
		// create one LargeRoom
		Room largeRoom = roomFactory.getRoom(RoomType.LARGEROOM);
		
		// print all
		System.out.println("Basic Room " + basicRoom.toString());
		System.out.println("Suit Room " + suitRoom.toString());
		System.out.println("Large Room " + largeRoom.toString());
	}
}
