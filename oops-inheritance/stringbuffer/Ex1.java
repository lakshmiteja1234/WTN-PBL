package com.wipro.stringbuffer;

public class Ex1 {
	public static boolean isPalindrome (String input1) {
		int digitCount = input1.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("daddy"));
		System.out.println(isPalindrome("Mam"));
		System.out.println(isPalindrome("ice"));

	}

}
