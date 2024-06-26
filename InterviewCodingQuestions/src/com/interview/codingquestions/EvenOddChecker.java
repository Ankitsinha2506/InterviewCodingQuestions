package com.interview.codingquestions;

import java.util.Scanner;

// Java Program to Check a Number is Odd or Even.
public class EvenOddChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check weather number is Even or Odd.");
		int num = sc.nextInt();
		
		if (isEven(num)) {
			System.out.println(+num + " is Even Number");
		}
		else {
			System.out.println(num + " is Odd Number");
		}
		sc.close();
		
	}

	private static boolean isEven(int num) {
		return num % 2 == 0;
	}

}
