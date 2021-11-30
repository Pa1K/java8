package com.pavan.exception;


public class ExceptionDemo {

	public static void main(String[] args) {
		
		// case 1, when Error caught, program execution continues
		/**
		try {
			throw new Error();
		}
		catch(Error e) {
			System.out.println("Error caught in catch block");
		}
		*/
		
		// case 2, if we didn't caught error, program execution gets stopped
		/**
		try {
			throw new Error();
		}
		catch(Exception e) {
			System.out.println("Exception caguht in catch block");
		}
		**/
		
		try {
			System.out.println(factorial(5));
			
		}
		catch(Error e) {
			System.out.println(e);
			System.out.println("Error caught in catch block");
		}
		
		System.out.println("checking if we caught error, whether program will execute or not");
		
		try {
			System.out.println(factorial(5));
			
		}
		catch(Error e) {
			System.out.println(e);
			System.out.println("Error caught in catch block");
		}
		
		System.out.println("checking if we caught error, whether program will execute or not");

	}

	private static int factorial(int i) {
		return i*factorial(i);
		
	}

}
