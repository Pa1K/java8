package com.pavan.inheritance;

public class Child extends Parent{

	public void add(int a, int b) {
		System.out.println("child add method" + (a+b));
		
	}
	
	public int divide(int a, int b){
		System.out.println("child divide method");
		privateMethod();
		return a/b;
	}
	//Cannot reduce the visibility of the inherited method from Parent, so change to same level or parent level 
	
	//Cannot override the final method from Parent
	/**
	public void multiply(int a, int b){
		
	}
	*/
	
	 private void privateMethod() {
			System.out.println("privateMethod in child");
		}
	
}
