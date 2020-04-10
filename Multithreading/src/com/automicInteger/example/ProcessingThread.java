package com.automicInteger.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {

	private AtomicInteger count = new AtomicInteger();

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processJob(i);
			count.incrementAndGet();
		}
	}

	public int getCount() {
		return this.count.get();
	}

	private void processJob(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
