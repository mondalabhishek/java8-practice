package com.learnjava8.funcational.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SupplierExample {
	
	static Supplier<Student>  supplier =()->{
		return new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));  
	};

	
	static Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
	public static void main(String[] args) {
		

		System.out.println(supplier.get());
		System.out.println(listSupplier.get());

	}

}
