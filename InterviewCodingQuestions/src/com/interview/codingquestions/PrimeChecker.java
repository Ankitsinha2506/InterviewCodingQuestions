package com.interview.codingquestions;

import java.util.Scanner;
// Java Program to Check Weather a Number is Prime or Not.

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number to Check Number is Prime or NOt ? : ");
		int number = sc.nextInt();
		
		if (isPrime(number)) {
			System.out.println(number + " is a Prime Number.");
		}
		else {
			System.out.println(number + " is not Prime Number.");
		}
		
		sc.close();
		
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(number); i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
