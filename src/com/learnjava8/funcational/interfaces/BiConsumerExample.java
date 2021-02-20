package com.learnjava8.funcational.interfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		BiConsumer<String, String> biConsumer = (a,b)->{
			System.out.println("a: "+a+", b: "+b);
		};
		
		biConsumer.accept("john", "jack");

		BiConsumer<Integer, Integer> multiply = (a,b)->{
			System.out.println("Multiplication result: "+a*b);
		};
		multiply.accept(10, 2);
		
		BiConsumer<Integer, Integer> division = (a,b)->{
			System.out.println("Diviosn result: "+a/b);
		};
		
		multiply.andThen(division).accept(10, 2);
		
		nameAndActivities();
		
	}
	
	public static void nameAndActivities() {
		BiConsumer<String, List<String>> studentConsumer = (name, activities) -> System.out.println("Name: "+name+", activities: "+activities);
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student->studentConsumer.accept(student.getName(), student.getActivities()));
	}

}
