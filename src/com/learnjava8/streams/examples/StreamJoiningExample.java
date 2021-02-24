package com.learnjava8.streams.examples;

import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamJoiningExample {
	
	public static String joining1() {
		return StudentDataBase.getAllStudents().stream().map(Student:: getName).collect(Collectors.joining());
	}
	
	public static String joining2() {
		return StudentDataBase.getAllStudents().stream().map(Student:: getName).collect(Collectors.joining("-"));
	}
	
	
	public static String joining3() {
		return StudentDataBase.getAllStudents().stream().map(Student:: getName).collect(Collectors.joining("-","(",")"));
	}

	public static void main(String[] args) {
		
		System.out.println(joining1());
		System.out.println(joining2());
		System.out.println(joining3());
		
	}

}
