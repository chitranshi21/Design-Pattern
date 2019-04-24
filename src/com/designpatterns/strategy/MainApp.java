package com.designpatterns.strategy;

import com.designpatterns.strategy.actions.Attendence;
import com.designpatterns.strategy.actions.FullTimeSalary;
import com.designpatterns.strategy.actions.FullTimeVacations;
import com.designpatterns.strategy.actions.InternAttendence;
import com.designpatterns.strategy.actions.Salary;
import com.designpatterns.strategy.actions.Vacations;
import com.designpatterns.strategy.entity.Employee;
import com.designpatterns.strategy.entity.SpecialInternEmployee;

public class MainApp {
	
	public static void main(String[] args) {
		Salary salary = new FullTimeSalary();
		Attendence attendence = new InternAttendence();
		Vacations vacations = new FullTimeVacations();
		
		Employee emp = new SpecialInternEmployee(salary, attendence, vacations);
		System.out.println(emp.calculateAttendence());
		System.out.println(emp.calculateSalary());
		System.out.println(emp.calculateVacations());
	}

}
