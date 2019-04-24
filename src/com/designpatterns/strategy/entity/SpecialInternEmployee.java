package com.designpatterns.strategy.entity;

import com.designpatterns.strategy.actions.Attendence;
import com.designpatterns.strategy.actions.Salary;
import com.designpatterns.strategy.actions.Vacations;

/*
 * this is a special case of intern employee
 * who will get the salary of full time employee
 * but attendence allowance of intern.
 * Maybe some favour, but the point is with strategy 
 * we can configure object based on our needs
 */
public class SpecialInternEmployee extends Employee {
	
	private Salary salary;
	private Attendence attendence;
	private Vacations vacations;
	
	// this is dependency injection by construtor.
	// we can also do it with setters or configuration
	// but this allows us to configure the object at the time of initialization.
	public SpecialInternEmployee(Salary salary, Attendence attendence, Vacations vacations) {
		 this.salary = salary;
		 this.attendence = attendence;
		 this.vacations = vacations;
	}

	@Override
	public int calculateSalary() {
		return salary.calculateSalary();
	}

	@Override
	public int calculateAttendence() {
		return attendence.calculateAttendence();
	}

	@Override
	public int calculateVacations() {
		return vacations.calculateVacations();
	}

}
