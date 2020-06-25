package com.wipro.arrays;

public class Ex1 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		double sum = 0;
		double avg;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		avg = sum / array.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

}
