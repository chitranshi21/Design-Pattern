package com.designpatterns.adapter;

public class MainApp {
	
	public static void main(String[] args) {
		
		// the adaptor takes the instance of the adaptee you want to run
		// and you can still use the target object to use.
		Itarget target = new Adapter(new Adaptee());
		target.request();
		
		
	}
}
