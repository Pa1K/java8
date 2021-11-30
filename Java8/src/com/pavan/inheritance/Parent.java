package com.pavan.inheritance;

public class Parent {
	
	public void add(int a, int b) {
		System.out.println("parent add method" + (a+b));
		
	}
	
	public void sub(int a, int b) {
		System.out.println("parent sub method" + (b-a));
	}
	
	public int divide(int a, int b){
		System.out.println("parent method");
		return a/b;
	}
	
	public final void multiply(int a,int b) {
		System.out.println("parent final multiply method: "+a*b);
	}
	
	 private void privateMethod() {
		System.out.println("privateMethod in parent");
	}
	
}
