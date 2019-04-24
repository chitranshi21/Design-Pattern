package com.designpatterns.strategy.actions;

public class FullTimeSalary implements Salary {

	public final int PAY = 200;
	@Override
	public int calculateSalary() {
		return PAY;
	}

}
