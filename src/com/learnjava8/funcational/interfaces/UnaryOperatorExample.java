package com.learnjava8.funcational.interfaces;

import java.util.function.UnaryOperator;

//same as fucntion, use when Input and return are of Same type
public class UnaryOperatorExample {
	
	static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("Java8"));

	}

}
