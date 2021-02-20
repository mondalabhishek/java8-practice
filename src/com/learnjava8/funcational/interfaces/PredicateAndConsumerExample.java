package com.learnjava8.funcational.interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateAndConsumerExample {

	Predicate<Student> predicateStudentGrade = (student) -> student.getGradeLevel() > 3;
	Predicate<Student> predicateStudentGPA = (student) -> student.getGpa() >= 3.9;
	
	BiPredicate<Integer, Double> biPredicate = (grade, gpa)-> grade>3 && gpa>=3.9;

	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
			.println("Name: " + name + ", activities: " + activities);

	Consumer<Student> studentConsumer = (student) -> {
		if (predicateStudentGrade.and(predicateStudentGPA).test(student)) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
		
		if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> students) {

		students.forEach(studentConsumer);

	}

	public static void main(String[] args) {
		new PredicateAndConsumerExample().printNameAndActivities(StudentDataBase.getAllStudents());
	}

}
