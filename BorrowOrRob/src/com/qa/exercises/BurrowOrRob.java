package com.qa.exercises;

public class BurrowOrRob {

	public static boolean palindrome(String sentance) {
		String s = sentance.toLowerCase().replace(" ", "");
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;

			}
		}

		return true;

	}

	public static boolean palindromeStringBuilder(String sentance) {
		StringBuilder stringBuilder = new StringBuilder();
		String s = sentance.toLowerCase().replace(" ", "");
		stringBuilder.append(s);
		stringBuilder.reverse();
		return s.equals(stringBuilder.toString());
	}

public static void main(String[] args) {
	System.out.println(palindrome("Borrow or Rob"));
	System.out.println(palindrome("race car"));
	System.out.println(palindromeStringBuilder("Borrow or Rob"));
	System.out.println(palindromeStringBuilder("race car"));
}
}
