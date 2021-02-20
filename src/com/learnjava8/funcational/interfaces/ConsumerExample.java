package com.learnjava8.funcational.interfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> consumer = student -> System.out.println(student);
	static Consumer<Student> consumerName = student -> System.out.println(student.getName());
	static Consumer<Student> consumerActivity = student -> System.out.println(student.getActivities());
	
	public static void main(String args[]) {
		Consumer<String> c1 = (a)-> System.out.println(a.toUpperCase());
		
		c1.accept("java8");
		
		
		printStudents();
		
		//printNameAndActivities();
		
		printNameAndActivitiesUsingCond();
	}
	
	public static void printStudents() {
		List<Student> students= StudentDataBase.getAllStudents();
		students.forEach(consumer);		
	}
	
	
	public static void printNameAndActivities() {
		List<Student> students= StudentDataBase.getAllStudents();		
		
		students.forEach(consumerName.andThen(consumerActivity)); //Consumer Chaining
	}

	public static void printNameAndActivitiesUsingCond() {
		List<Student> students= StudentDataBase.getAllStudents();
		
		
		students.forEach((student)->{
			if(student.getGradeLevel()>3) {
				consumerName.andThen(consumerActivity).accept(student);
			}
		}); 
	}
}
