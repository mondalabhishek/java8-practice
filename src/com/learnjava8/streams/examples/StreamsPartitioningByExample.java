package com.learnjava8.streams.examples;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsPartitioningByExample {
	
	public static void partitionaling_by1() {
		Predicate<Student> gpaPredicate  = student-> student.getGpa()>=3.8;
		
		
		Map<Boolean, List<Student>> studentMap=  StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(gpaPredicate));
		
		System.out.println(studentMap);
	}
	
	public static void partitionaling_by2() {
		Predicate<Student> gpaPredicate  = student-> student.getGpa()>=3.8;
		
		
		Map<Boolean, Set<Student>> studentMap=  StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
		
		System.out.println(studentMap);
	}

	
	
	public static void main(String[] args) {
		partitionaling_by1();
		partitionaling_by2();

	}

}
