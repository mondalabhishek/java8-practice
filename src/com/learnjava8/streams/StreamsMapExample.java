package com.learnjava8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {

	static Set<String> namesList(){
		/*
		 * List<String> studentList = StudentDataBase.getAllStudents().stream()
		 * //Stream<Student> .map(Student:: getName) //stream<String> .map(String::
		 * toUpperCase) //stream<String> in upper case .collect(Collectors.toList());
		 */
		
		Set<String> studentList =  StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student:: getName) //stream<String>
				.map(String:: toUpperCase) //stream<String> in upper case
				.collect(Collectors.toSet());
		
		return studentList;
	}
	
	public static void main(String[] args) {
			
		System.out.println(namesList());

	}

}
