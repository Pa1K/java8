package com.pavan.defaultMethodsInterface;

public class InterfaceImplementingClass1 implements DefaultMethodsInterfaceDemo,DefaultMethodsInterfaceDemo2 {

	public static void main(String[] args) {
		
		InterfaceImplementingClass1 interfaceImplementingClass1 = new InterfaceImplementingClass1();
		interfaceImplementingClass1.method1();
		interfaceImplementingClass1.defaultMethod();
		interfaceImplementingClass1.defaultMethod2();
		interfaceImplementingClass1.defaultMethod3();
	}

	@Override
	public void method1() {
		
		System.out.println("abstract method is implemented");
		/** when we implement an interface, then we need to implement unimplemented methods of the interface
		 *  so whenever a new method is added in interface, all implementing classes has to make implement unimplemented methods of the interface
		 */
	}
	
	@Override
	public void defaultMethod2() {
		System.out.println("override method of defaultMethod2");
	}

	
	
	/**
	 * Duplicate default methods named defaultMethod3 with the parameters () and () are inherited from 
	 * the types DefaultMethodsInterfaceDemo2 and DefaultMethodsInterfaceDemo - compilation
	 */
	
	
	
	  @Override public void defaultMethod3() {
	  System.out.println("override method of defaultMethod3"); }
	 
	//OR
	/*
	 * @Override public void defaultMethod3() { 
	 * DefaultMethodsInterfaceDemo.super.defaultMethod3(); }
	 */
	//OR
	/*
	 * @Override public void defaultMethod3() { 
	 * DefaultMethodsInterfaceDemo2.super.defaultMethod3(); }
	 */

}
