package com.pavan.multithread;

public class MyThread extends Thread {

	MyThread(){}
	
	MyThread(Runnable r){
		//super(r);
	}
	
	public void run() {
		System.out.println("Inside Thread");
	}
}
