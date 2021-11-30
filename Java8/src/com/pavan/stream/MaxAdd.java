package com.pavan.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class MaxAdd {
	
	
	public static void main(String[] args) {
		int[] arr1 = { 10, 5, 8 };
		int[] arr2 = {11, 7, 4};
		
		/*
		 * double dblTotal=4.0; int intValue = 8; String stringVal = "pavan";
		 * 
		 * System.out.printf("Total is: $%,.2f%n", dblTotal);
		 * System.out.printf("Total: %-10.2f: ", dblTotal);
		 * 
		 * System.out.println(); System.out.printf("% 4d", intValue );
		 * 
		 * System.out.println(); System.out.printf("%20.10s\n", stringVal);
		 * 
		 * String s = "Hello World";
		 * System.out.printf("The String object %s is at hash code %h%n", s, s);
		 */
		
		OptionalDouble opt = Arrays.stream(arr1).average();
		System.out.println(opt.getAsDouble());
	
	}

}

/**
https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
*/