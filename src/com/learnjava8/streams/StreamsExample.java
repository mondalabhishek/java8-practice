package com.learnjava8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		// Student name and their activities in a map	
		Predicate<Student> gpaPredicate= student -> student.getGpa()>=3;
		Predicate<Student> gradePredicate= student -> student.getGradeLevel()>=3.9;
		
		
		
		//use peek() to debug stream
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.peek(student->System.out.println("At the start: "+student)) //Use it for debugging only
				.filter(gpaPredicate) //Stream of Students
				.peek(student->System.out.println("After 1st Filter: "+student))
				.filter(gradePredicate)//Stream of Students
				.peek(student->System.out.println("After 2nd Filter: "+student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));// Final Result map

		System.out.println(studentMap);
	}

}
