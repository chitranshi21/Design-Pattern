package com.designpatterns.decorator;

import com.designpatterns.decorator.decorator.StarDecorator;
import com.designpatterns.decorator.reader.Reader;
import com.designpatterns.decorator.reader.ReaderImpl;

/**
 * This is the main method of decorator.
 * by making the decorator class extend the main class to be decorated
 * it can be used against the same interface
 * also because it has a reference to the origin object
 * it can call the method and do something over it
 * @author shubhamchitranshi
 *
 */

public class MainApp {
	
	public static void main(String[] args) {
		Reader reader = new ReaderImpl(System.in);
		Reader decorator = new StarDecorator(reader);
		System.out.println(decorator.readLine());
	}

}
