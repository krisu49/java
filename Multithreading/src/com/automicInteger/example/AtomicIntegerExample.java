package com.automicInteger.example;

public class AtomicIntegerExample {

	public static void main(String[] args) throws InterruptedException {

		ProcessingThread processingThread = new ProcessingThread();

		Thread thread1 = new Thread(processingThread, "Thread t1");
		thread1.start();

		Thread thread2 = new Thread(processingThread, "Thread t2");
		thread2.start();

		thread1.join();
		thread2.join();
		
		System.out.println("Processing count = "+processingThread.getCount());
		
		System.out.println(Thread.getAllStackTraces());

	}

}
