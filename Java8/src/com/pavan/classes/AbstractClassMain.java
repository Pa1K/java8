package com.pavan.classes;

public class AbstractClassMain extends AbstractClass{

	public static void main(String[] args) {
			
		//AbstractClass ac1 = new AbstractClass(); // Cannot instantiate the type AbstractClass
		AbstractClass ac2 = new AbstractClassMain(); // We can have references of Base type.
		ac2.finalMethod2();
		AbstractClass.staticMethod2();
		ac2.abstractMethod();
		
		AbstractClassMain acm = new AbstractClassMain(); // constructor of abstract class is called when an instance of an inherited class is created 
		acm.finalMethod2();
		acm.staticMethod2();
		acm.abstractMethod();
	}

	@Override
	void abstractMethod() {
		System.out.println("abstractMethod in child");
		
	}
	
	// In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated but can only be inherited.

}
