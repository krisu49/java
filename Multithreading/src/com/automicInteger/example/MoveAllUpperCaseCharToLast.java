package com.automicInteger.example;

public class MoveAllUpperCaseCharToLast {

	public static String moveLastOfString(String inputStr) {

		char ch;
		String upperCase = "", lowerCase = "";
		for (int i = 0; i < inputStr.length(); i++) {
			ch = inputStr.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upperCase = upperCase + ch;
			else
				lowerCase = lowerCase + ch;
		}

		return lowerCase + upperCase;
	}

	public static String moveLastOfStringUsingRegularExpression(String input) {
		return input.replaceAll("[A-Z]+", "") + input.replaceAll("[^A-Z]+", "");
	}

	public static void main(String[] args) {

		String str = "Krishna Kumar Singh";
		System.out.println(moveLastOfString(str));

		System.out.println(moveLastOfStringUsingRegularExpression(str));
	}

}
