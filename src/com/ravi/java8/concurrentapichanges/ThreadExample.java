package com.ravi.java8.concurrentapichanges;

public class ThreadExample extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Run method start...");
	}
	
	
	public static void main(String[] args) {
		
	// Thread : Independent path of execution within the same  program..	
		// Thread object can not be reuse.. 
		for(int i = 0 ; i < 100 ; i++) {
			
			System.out.println("hi");
		}
		ThreadExample t = new ThreadExample();
		t.start();
	//	t.start(); // it throw the illegal thread state exception  . thread object cannot be reuse...
		
		// in order to overcome the problem of reuse the thread "Thread Pool concept is introduce..."
		
		// Type of Thread pool
		// 1. fixed thread pool
		//2. cached thread pool
		//3. schedule thread pool
		//4. single thread pool.
		
		// How to create the Thread pool?
		//Using Executor Framework..
		
		
		
		
	}

}
