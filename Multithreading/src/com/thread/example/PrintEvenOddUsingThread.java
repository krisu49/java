package com.thread.example;

public class PrintEvenOddUsingThread implements Runnable {

	private int upto = 10;
	static int number = 1;
	int evenOrOdd;
	static Object lock = new Object();

	PrintEvenOddUsingThread(int evenOrOdd) {
		this.evenOrOdd = evenOrOdd;
	}

	@Override
	public void run() {
		while (number < upto) {
			synchronized (lock) {
				while (number % 2 != evenOrOdd) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}

}
