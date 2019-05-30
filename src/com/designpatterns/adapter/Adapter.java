package com.designpatterns.adapter;

public class Adapter implements Itarget {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee a) {
		adaptee = a;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
		
	}
	
	

}
