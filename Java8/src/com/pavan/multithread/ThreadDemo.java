package com.pavan.multithread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		/**
		new MyThread().start();
		new MyThread(new RunnableDemo()).start();
		new RunnableDemo().run();
		**/
		
		RunnableDemo A = new RunnableDemo("A"); // object created
		RunnableDemo B = new RunnableDemo("B"); // object created
		
		B.start(); // executes run() method of the class which implements Runnable
		A.start(); // executes run() method of the class which implements Runnable
		
	}

}
