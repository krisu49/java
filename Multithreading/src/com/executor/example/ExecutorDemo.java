package com.executor.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 10; i++) {
			
			executorService.execute(new Task());
		}
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Current Thread: "+Thread.currentThread().getName());
	}

}
