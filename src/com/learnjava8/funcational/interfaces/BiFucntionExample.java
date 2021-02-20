package com.learnjava8.funcational.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiFucntionExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (studentList, studentPredicate)->{
		Map<String,Double> sudentGradeMap = new HashMap<>();
		
		studentList.forEach((student)->{
			if(studentPredicate.test(student)) {
				sudentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		
		return sudentGradeMap;
	};

	public static void main(String[] args) {
		
			System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.predicateStudentGPA));
	}

}
