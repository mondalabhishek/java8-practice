package com.learnjava8.methodreference;

import java.util.function.Function;

public class MethodReferenceExample {
	
	static Function<String, String> toUpperCaseLamda = (s)-> s.toUpperCase();
	
	static Function<String, String> toUpperCaseLamdaMethodReference = String::toUpperCase;

	public static void main(String[] args) {
		
		System.out.println("toUpperCaseLamda:: "+toUpperCaseLamda.apply("Hello"));
		
		System.out.println("toUpperCaseLamdaMethodReference:: "+toUpperCaseLamdaMethodReference.apply("Hello"));
		
	}

}
