package com.learnjava8.streams.examples;

import java.util.stream.Collectors;

import com.learnJava.data.StudentDataBase;

public class StreamsCountingExample {
	
	public static long count() {
		return StudentDataBase.getAllStudents().stream()
				.filter((s)->s.getGpa()>3)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		
		System.out.println(count());

	}

}
