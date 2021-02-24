package com.learnjava8.streams.examples;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsSumAverageExample {
	
	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student:: getNoteBooks));
	}
	
	
	public static Double average() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student:: getNoteBooks));
	}

	public static void main(String[] args) {
	
		System.out.println("Sum:: "+ sum());
		System.out.println("Average:: "+ average());

	}

}
