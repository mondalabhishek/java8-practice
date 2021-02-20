package com.learnjava8.lambdas;

import java.util.function.Consumer;

public class LambdaVar1 {

	public static void main(String[] args) {
	
		int i=0;
		//cant pass local variable as input
		//Consumer<Integer> c1=(i)-> System.out.println(i+1);
		
		//cant reassign value to local variable
		Consumer<Integer> c1=(val)-> {
			//i = 5;
		};

	}

}
