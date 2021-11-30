package com.pavan.lambda;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void abstractMethod();
	
	//void abstractMethod2(); // compilation error: Invalid '@FunctionalInterface' annotation; FunctionalInterfaceDemo is not a functional interface
	
	default void print() {
		System.out.println("this is default print method in interface FunctionalInterfaceDemo");
	}
}
