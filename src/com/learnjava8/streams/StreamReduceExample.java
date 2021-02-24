package com.learnjava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamReduceExample {
	
	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
					//a=1 (identity value), b=2 (from Stream) --> Result =2
					//a=2(Result From Last Iteration), b=3 (from Stream) --> Result =6
					.reduce(1, (a,b)->a*b);
	}
	
	
	public static Optional<Student> getHighestGPAStudent(){
		return StudentDataBase.getAllStudents().stream()
			.reduce((s1,s2)->{
				return s1.getGpa()>s2.getGpa()?s1:s2;
			});
	}
	

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(2,3,4,5,7);
		System.out.println(performMultiplication(integers));
		
		Optional<Student> st= getHighestGPAStudent();
		if(st.isPresent()) {
			System.out.println(st);
		}

	}
	
}
