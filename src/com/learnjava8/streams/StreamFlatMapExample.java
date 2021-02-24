package com.learnjava8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFlatMapExample {
	
	
	public static List<String> printStudentActivities(){
		List<String> activities = StudentDataBase.getAllStudents().stream() //Stream<Student>
			.map(Student::getActivities) //Stream<List<String>>
			.flatMap(List::stream) //Stream<String>
			.distinct()
			.sorted()
			.collect(Collectors.toList());
		
		return activities;
	}
	
	public static long countStudentActivities(){
		long count = StudentDataBase.getAllStudents().stream() //Stream<Student>
			.map(Student::getActivities) //Stream<List<String>>
			.flatMap(List::stream) //Stream<String>
			.distinct()
			.count();
		
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Activities::" +printStudentActivities());
		
		System.out.println("Count::"+ countStudentActivities());

	}

}
