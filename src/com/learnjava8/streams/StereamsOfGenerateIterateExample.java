package com.learnjava8.streams;

import java.util.stream.Stream;

public class StereamsOfGenerateIterateExample {

	public static void main(String[] args) {
		Stream<String> names= Stream.of("Rajesh","Leonard","Penny","Sheldon","Howard");
		
		Stream.iterate(1,x->x*2)
		.limit(10).forEach(System.out:: println);
		
		names.forEach(System.out:: println);
	}

}
