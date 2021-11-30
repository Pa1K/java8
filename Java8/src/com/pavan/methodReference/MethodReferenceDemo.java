package com.pavan.methodReference;

import com.pavan.lambda.FunctionalInterfaceDemo;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testImplementation;
		functionalInterfaceDemo.abstractMethod();
	}
}

class Test {
	
	static void testImplementation(){
		
		System.out.println("Test class, testImplementation method");
		
	}
}