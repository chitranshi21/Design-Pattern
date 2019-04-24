package com.designpatterns.strategy.actions;

public class InternAttendence implements Attendence {
	

	@Override
	public int calculateAttendence() {
		// consider working on saturdays as well
		return 24;
	}

}
