package com.designpatterns.singleton;

/**
 * This is an example of a singleton class
 * @author shubhamchitranshi
 *
 */
public class Singleton {
	/*
	 * the idea is to make the constructor private. This will 
	 * restrict any other class to instantiate the object.
	 * and provide static methods to get the instance.
	 */
	
	private static Singleton instance;
	private String name;
	
	private Singleton() {
		
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static Singleton getInstance() {
		if(null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public String toString() {
		// just an example of other methods.
		// these methods can contain business logic as normal.
		return instance.name;
	}

}
