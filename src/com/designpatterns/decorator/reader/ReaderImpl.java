package com.designpatterns.decorator.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * this is a simple implementation of Reader Class
 */
public class ReaderImpl extends Reader {

	public ReaderImpl(InputStream stream) {
		super(stream);
	}

	@Override
	public String readLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(getStream()));
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
