package com.learnjava8.lambdas;

import java.util.Comparator;

public class ComprartorLambdaExample {

	public static void main(String[] args) {
		
		/**
		 * Prior Java 8
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		};
		
		System.out.println("Result of the comparator: "+comparator.compare(2, 3));
		
		//Comparator in Java 8
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		
		System.out.println("Result of the comparator Lambda: "+comparatorLambda.compare(2, 3));
		
		Comparator<Integer> comparatorLambda2 = (a,  b) -> a.compareTo(b);
		
		System.out.println("Result of the comparator Lambda2: "+comparatorLambda2.compare(2, 3));
	}

}
