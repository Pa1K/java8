package com.pavan.classes;

abstract class AbstractClass {
	
	AbstractClass(){
		System.out.println("AbstractClass Constuctor");
	}
	
	abstract void abstractMethod();
	
	//public abstract  final void finalMethod(); // The abstract method finalMethod in type AbstractClass can only set a visibility modifier, one of public or protected
	final void finalMethod2() {
		System.out.println("final method in abstract class");
	}
	
	//public abstract static void staticMethod(); // The abstract method staticMethod in type AbstractClass can only set a visibility modifier, one of public or protected
	
	static void staticMethod2() {
		System.out.println("static method in abstract class");
	}
}
