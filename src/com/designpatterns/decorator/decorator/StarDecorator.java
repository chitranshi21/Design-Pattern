package com.designpatterns.decorator.decorator;

import java.io.InputStream;

public class StarDecorator extends ReaderDecorator {

	public StarDecorator(InputStream stream) {
		super(stream);
	}
	
	/*
	 * This method has same signature as the Reader class
	 * and it is overriden here.
	 * The decorator impl has an instance of the reader object 
	 * and calls the same method as as in reader and does some decoration over it
	 * we can then wrap not just a reader in the decorator but also other decorator
	 * 
	 */
	@Override
	public String readLine() {
		return super.getReader().readLine() + "*";
	}

}
