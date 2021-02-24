package com.learnjava8.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 50);
		System.out.println(intStream.count());
		
		System.out.println("range ");
		IntStream.range(1, 50).forEach(v->System.out.print(v+", "));
		
		System.out.println("\nrange closed");
		IntStream.rangeClosed(1, 50).forEach(v->System.out.print(v+", "));
		
		
		System.out.println("\nLong range closed");
		LongStream.rangeClosed(1, 50).forEach(v->System.out.print(v+", "));
		
		System.out.println("\ndouble closed");
		LongStream.rangeClosed(1, 50).asDoubleStream().forEach(v->System.out.print(v+", "));
	}
}
