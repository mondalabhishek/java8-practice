package com.learnjava8.streams;

import com.learnJava.data.StudentDataBase;

public class StreamsMatchExample {

	public static boolean allMatchEx() {
		return StudentDataBase.getAllStudents().stream().allMatch(student->student.getGpa()>=3.5);
	}
	
	public static boolean anyMatchEx() {
		return StudentDataBase.getAllStudents().stream().anyMatch(student->student.getGpa()>=5);
	}
	
	
	public static boolean noneMatchEx() {
		return StudentDataBase.getAllStudents().stream().noneMatch(student->student.getGpa()>=4);
	}
	public static void main(String[] args) {
		System.out.println("allMatchEx:: "+allMatchEx());
		System.out.println("anyMatchEx:: "+anyMatchEx());
		System.out.println("noneMatchEx:: "+noneMatchEx());
	}

}
