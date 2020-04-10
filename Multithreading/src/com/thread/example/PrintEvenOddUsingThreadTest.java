package com.thread.example;

public class PrintEvenOddUsingThreadTest {

	public static void main(String[] args) {

		PrintEvenOddUsingThread odd = new PrintEvenOddUsingThread(1);
		PrintEvenOddUsingThread even = new PrintEvenOddUsingThread(0);
		Thread td1 = new Thread(odd, "Odd--->");
		Thread td2 = new Thread(even, "Even-->");
		td1.start();
		td2.start();

	}

}
