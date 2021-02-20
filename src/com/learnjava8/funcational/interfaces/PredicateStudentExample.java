package com.learnjava8.funcational.interfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {
	
	static Predicate<Student> predicateStudentGrade = (student)-> student.getGradeLevel()>3;
	static Predicate<Student> predicateStudentGPA = (student)-> student.getGpa()>=3.9;

	public static void main(String[] args) {
		
		filterStudentByGradeLevel();
		
		filterStudentByGPA();
		
		filterStudent();

	}
	
	public static void filterStudentByGradeLevel() {
		
		System.out.println("Inside filterStudentByGradeLevel");
		
		List<Student> studentList =StudentDataBase.getAllStudents();
		
		studentList.forEach((student)->{
			if(predicateStudentGrade.test(student)) {
				System.out.println("Student :" +student);
			}
		});
	}
	
	public static void filterStudentByGPA() {
		System.out.println("Inside filterStudentByGPA");
		List<Student> studentList =StudentDataBase.getAllStudents();
		
		studentList.forEach((student)->{
			if(predicateStudentGPA.test(student)) {
				System.out.println("Student :" +student);
			}
		});
	}
	
	public static void filterStudent() {
		System.out.println("Inside filterStudent");
		List<Student> studentList =StudentDataBase.getAllStudents();
		
		studentList.forEach((student)->{
			if(predicateStudentGrade.and(predicateStudentGPA).test(student)) {
				System.out.println("Student :" +student);
			}
		});
	}

}
