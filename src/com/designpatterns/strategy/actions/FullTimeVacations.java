package com.designpatterns.strategy.actions;

public class FullTimeVacations implements Vacations {

	public final int VACATIONS = 32;
	@Override
	public int calculateVacations() {
		return VACATIONS;
	}

}
