package com.learnjava8.lambdas;

public class RunnableLambdaExample{
	
	public static void main(String[] args) {
		/**
		 * Prior Java 8
		 * 
		 */
		
		Runnable runnable =new Runnable() {			
			@Override
			public void run() {
				System.out.println("Inside runnable");				
			}
		};
		
		new Thread(runnable).start();
		
		
		//Java-8 Lambda Syntax
		Runnable runnableLambda = () -> {
			System.out.println("Inside runnable lambda");
		};
		
		Runnable runnableLambda1 = () -> System.out.println("Inside runnable lambda1");
		
		new Thread(runnableLambda).start();
		
		new Thread(runnableLambda1).start();
		
		new Thread (() -> System.out.println("Inside runnable lambda2")).start();;
	}

}
