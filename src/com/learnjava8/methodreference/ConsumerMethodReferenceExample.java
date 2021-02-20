package com.learnjava8.methodreference;

import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

	//static Consumer<Student> consumer = student -> System.out.println(student);
	
	static Consumer<Student> consumer =  System.out::println;
	static Consumer<Student> consumer2 =  Student:: printListOfActivities;
	
	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(consumer);
		StudentDataBase.getAllStudents().forEach(consumer2);

	}

}
