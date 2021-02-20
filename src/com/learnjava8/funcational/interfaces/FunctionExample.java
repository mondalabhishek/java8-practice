package com.learnjava8.funcational.interfaces;

import java.util.function.Function;


/**
 * While using andThen, output of one function passed to another
 * It takes two param, one for input, other for output
 * @author amondal
 *
 */
public class FunctionExample {
	
	static Function<String, String> fn1 = (value)-> value.toUpperCase();
	
	static Function<String, String> addSomeString = (value)-> value.concat("Default");

	public static void main(String[] args) {
		
		System.out.println("Function exmaple: "+fn1.apply("java8"));
		
		System.out.println("Add some string exmaple: "+addSomeString.apply("java8"));
		
		System.out.println("And Then string exmaple: "+fn1.andThen(addSomeString).apply("java8"));
		
		
		//Diffrence between compose and and then is the order in which fucntions are invoked. In this case addSomething will be called followed by fn1
		System.out.println("Compose string exmaple: "+fn1.compose(addSomeString).apply("java8"));

	}

}
