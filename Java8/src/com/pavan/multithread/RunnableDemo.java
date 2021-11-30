package com.pavan.multithread;

public class RunnableDemo implements Runnable {

	private Thread t;
	private String threadName;

	RunnableDemo(String threadName) {
		this.threadName = threadName;
	}

	public RunnableDemo() {

	}

	@Override
	public void run() {

		//System.out.println("Inside Runnable");
		//System.out.println(threadName);

		/* while(true) { System.out.print(threadName); } */
		//no format followed when we run two independent threads


	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
