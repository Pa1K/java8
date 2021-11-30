package com.pavan.synchronise;

public class SynchroniseDemo {

	public synchronized void methodA(int i, String msg) {
		System.out.println(Integer.toString(i));
		System.out.println(msg);
	}
	
	public void methodB(int i, String msg) {
		synchronized(this) {
			System.out.println(Integer.toString(i));
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		
		SynchroniseDemo synchroniseDemo = new SynchroniseDemo();
		synchroniseDemo.methodA(1, "A method");
		synchroniseDemo.methodB(2, "B method");
	}

}
