package com.pavan.multithread;

public class SyncDemo {

	public static synchronized void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread();
		t.start();
		System.out.println("X");
		
		t.wait(1000);
		System.out.println("Y");
	}

}
