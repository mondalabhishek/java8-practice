package com.learnjava8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamCompartorExample {
	
	public static List<Student> sortStudentsByName(){
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student:: getName))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGPA(){
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student:: getGpa))
			.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGPADesc(){
		return StudentDataBase.getAllStudents()
			.stream()
			.sorted(Comparator.comparing(Student:: getGpa).reversed())
			.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println("Sorted by name::");
		sortStudentsByName().forEach(System.out:: println);
		
		System.out.println("Sorted by GPA::");
		sortStudentsByGPA().forEach(System.out:: println);
		
		System.out.println("Sorted by GPA Desc::");
		sortStudentsByGPADesc().forEach(System.out:: println);
	}

}
