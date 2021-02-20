package com.learnjava8.methodreference;

import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class RefactorMethodReferenceExample {
	
	static Predicate<Student> predicateStudentGrade = (student)-> student.getGradeLevel()>3;
	
	static Predicate<Student> predicateStudentGrade2 =  RefactorMethodReferenceExample:: greaterThanGradeLevel;
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel()>3;
	}

	public static void main(String[] args) {
		
		System.out.println(predicateStudentGrade.test(StudentDataBase.studentSupplier.get()));
		System.out.println(predicateStudentGrade2.test(StudentDataBase.studentSupplier.get()));

	}

}
