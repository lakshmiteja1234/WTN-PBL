package com.wipro.arrays;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		int[] array = {49, 5, 77, 11, 52};
		

		Arrays.sort(array);
		
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);
	}


}
