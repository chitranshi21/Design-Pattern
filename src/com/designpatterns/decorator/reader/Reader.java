package com.designpatterns.decorator.reader;

import java.io.InputStream;

/**
 * this is the abstract class that is extended by all the reader and the readline method is overriden
 * 
 * @author shubhamchitranshi
 *
 */

public abstract class Reader {
	
	private InputStream stream;
	
	public InputStream getStream() {
		return stream;
	}

	public void setStream(InputStream stream) {
		this.stream = stream;
	}

	
	public Reader(InputStream stream) {
		this.stream = stream;
	}
	
	public abstract String readLine();
}
