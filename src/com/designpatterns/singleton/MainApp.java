package com.designpatterns.singleton;

public class MainApp {
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.setName("first Name");
		
		System.out.println(instance);
		
		instance.setName("Second Name");
		
		// get the instance from the class and 
		// if its the same instance it will have set name 
		// as second name
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
	}

}
