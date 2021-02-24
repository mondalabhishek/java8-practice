package com.learnjava8.streams;

import java.util.stream.IntStream;

public class NumericStreamAgrregateExample {

	public static void main(String[] args) {
		
		System.out.println(IntStream.rangeClosed(1, 50).sum());
		
		System.out.println(IntStream.rangeClosed(1, 50).max());

	}

}
