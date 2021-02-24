package com.learnjava8.streams.examples;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsGroupByExample {

	public static Map<String, List<Student>> groupByGender() {

		Map<String, List<Student>> studentGrpMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));

		return studentGrpMap;
	}

	public static Map<String, List<Student>> groupByGPA() {

		Map<String, List<Student>> studentGrpMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average"));

		return studentGrpMap;
	}
	
	
	
	
	
	public static Map<Integer, Map<String,List<Student>>> twoLevelGrouping1() {

		Map<Integer, Map<String,List<Student>>> studentGrpMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average")));

		return studentGrpMap;
	}
	
	public static Map<String, Integer> twoLevelGrouping2() {

		Map<String, Integer> studentGrpMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,Collectors.summingInt(Student:: getNoteBooks)));

		return studentGrpMap;
	}
	
	public static LinkedHashMap<String, Set<Student>> threeAgrumentGroupBy() {
		LinkedHashMap<String, Set<Student>> s = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new, Collectors.toSet()));
		
		return s;
	}
	
	
	public static Map<Integer, Student>  calculateGPA() {
		
		Map<Integer, Student> std = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student:: getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student:: getGpa)),Optional::get)));
		
		return std;
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(groupByGender()); System.out.println(groupByGPA());
		 * System.out.println(twoLevelGrouping1());
		 * System.out.println(twoLevelGrouping2());
		 * 
		 * System.out.println(threeAgrumentGroupBy());
		 */
		
		System.out.println(calculateGPA());
	}
	

}
