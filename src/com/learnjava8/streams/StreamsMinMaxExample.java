package com.learnjava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
	
	public static Optional<Integer> findMaxValue(List<Integer> integers) {
		return integers.stream()
			.reduce((x,y)-> x>y?x:y);
	}
	
	public static Optional<Integer>  findMinValue(List<Integer> integers) {
		return integers.stream()
			.reduce((x,y)-> x<y?x:y);
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2,3,4,5,7);
		Optional<Integer> max = findMaxValue(integers);
		Optional<Integer> min = findMinValue(integers);	
		System.out.println("Max: "+(max.isPresent()?max.get():"na"));
		System.out.println("Min: "+(min.isPresent()?min.get():"na"));

	}

}
