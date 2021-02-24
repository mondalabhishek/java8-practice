package com.learnjava8.streams;

import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFindExample {
	
	
	public static Optional<Student> findFirst() {
		return StudentDataBase.getAllStudents().stream()
					.filter(student->student.getGpa()>3.9)
					.findFirst();
	}

	public static void main(String[] args) {
		Optional<Student> findFirst = findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}


	}

}
