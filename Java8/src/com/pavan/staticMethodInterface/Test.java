package com.pavan.staticMethodInterface;

public class Test implements StaticMethodInterface2 {

	public static void main(String[] args) {
		
		StaticMethodInterface.staticMethod();
		
		/**
		Test test = new Test();
		test.staticMethod();*/ // The method staticMethod() is undefined for the type Test
		
	}

	
}
