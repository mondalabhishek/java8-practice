package com.learnjava8.streams.examples;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMappingCollectorExample {
	
	
	
	public static void main(String[] args) {
		
		List<String> names = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.mapping(Student:: getName, Collectors.toList()));
		
		System.out.println("Names List:: "+ names);
		
		
		Set<String> namesSet = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student:: getName, Collectors.toSet()));
			
			System.out.println("Names set:: "+ namesSet);
		
	}

}
