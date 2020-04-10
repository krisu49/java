package com.automicInteger.example;

import java.util.Random;

public class GenerateRandomString {

	public static String generateRandomString(String aToZ) {
		Random rand = new Random();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < 17; i++) {
			int randIndex = rand.nextInt(aToZ.length());
			res.append(aToZ.charAt(randIndex));
		}
		return res.toString();
	}

	public static void main(String[] args) {
		String aToZ = "ABCD1234"; // 36 letter.
		String randomStr = generateRandomString(aToZ);
		System.out.println(randomStr);
		

	}

}
