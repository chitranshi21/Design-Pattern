package com.designpatterns.decorator.decorator;

import java.io.InputStream;

import com.designpatterns.decorator.reader.Reader;

/**
 * abstract class for the Decorator, this will be extended by all the impl of decorators
 * @author shubhamchitranshi
 *
 */

public abstract class ReaderDecorator extends Reader {
	
	private Reader reader;
	
	public ReaderDecorator(InputStream stream) {
		super(stream);
	}
	
	public ReaderDecorator(Reader reader) {
		super(reader.getStream());
		this.reader = reader;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}	
	
}
