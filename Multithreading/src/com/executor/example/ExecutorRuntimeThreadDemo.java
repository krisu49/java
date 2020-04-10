package com.executor.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRuntimeThreadDemo {

	public static void main(String[] args) {
		
		int threadCount = Runtime.getRuntime().availableProcessors();
		
		ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
		
		for (int i = 0; i < 100; i++) {
			
			executorService.execute(new Task());
		}
	}
}

class Task1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Current Thread: "+Thread.currentThread().getName());
	}

}
