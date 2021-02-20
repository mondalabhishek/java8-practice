package com.learnjava8.funcational.interfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	
	static Predicate<Integer> predicateNumber1 = (num)->{
		return num%2==0;
	};
	
	static Predicate<Integer> predicateNumber2 = (num)-> num%2==0;
	
	static Predicate<Integer> predicateNumber3 = (num)-> num%5==0;
	
	
	public static void predicateAnd() {
		System.out.println("Predicate and result is:" +predicateNumber2.and(predicateNumber3).test(10));
	}
	
	public static void predicateOr() {
		System.out.println("Predicate Or result is:" +predicateNumber2.or(predicateNumber3).test(9));
	}
	
	public static void predicateNegate() {
		System.out.println("Predicate Negate result is:" +predicateNumber2.or(predicateNumber3).negate().test(9));
	}

	public static void main(String[] args) {
	
		System.out.println("Is even: "+predicateNumber1.test(Integer.valueOf(6)));
			

		System.out.println("Is even: "+predicateNumber2.test(Integer.valueOf(5)));
		
		
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
