package com.wipro.flowcontrolstatements;

public class Ex14 {


		public static void main(String[] args) {
			int number = 756908;
			int sum = 0;
			
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			System.out.println(sum);

		}
}
