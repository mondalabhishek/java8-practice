package com.learnjava8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFilterExample {

	public static List<Student> filterStudent() {
		return StudentDataBase.getAllStudents().stream().
				filter(student -> student.getGender().equals("female"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		filterStudent().forEach(System.out::println);

	}

}
