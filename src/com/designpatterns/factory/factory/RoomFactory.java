package com.designpatterns.factory.factory;

import com.designpatterns.factory.entity.Room;

public abstract class RoomFactory {
	
	public  abstract Room getRoom(RoomType roomtype);

}
