package com.learnjava8.funcational.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class FunctionStuentExample {

	static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {
		Map<String, Double> studentGradeMap = new HashMap<>();

		students.forEach((student) -> {

			if (PredicateStudentExample.predicateStudentGPA.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}

		});

		return studentGradeMap;
	};

	public static void main(String[] args) {

		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

	}

}
