package com.learnjava8.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.learnJava.data.Student;

public class ConstructorRefereceExample {
	
	static Supplier<Student> studentSupplier = Student::new;
	
	static Function<String,Student> studentFucntion = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFucntion.apply("John"));

	}

}
