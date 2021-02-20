package com.learnjava8.funcational.interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static BinaryOperator<Integer> binaryOperator=(a,b)-> a*b;
	static Comparator<Integer> comparator = (a,b)-> a.compareTo(b);

	public static void main(String[] args) {
		
		System.out.println(binaryOperator.apply(3,4));
		BinaryOperator<Integer> maxByEx = BinaryOperator.maxBy(comparator);
		System.out.println(maxByEx.apply(4,5));
		
		BinaryOperator<Integer> minByEx = BinaryOperator.minBy(comparator);
		System.out.println(minByEx.apply(4,5));
	}

}
