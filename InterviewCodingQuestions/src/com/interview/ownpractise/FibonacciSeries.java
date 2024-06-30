package com.interview.ownpractise;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void fibonacci(int num)	{
		int firstTerm = 0;
		int secondTerm = 1;
		
		for(int i = 0; i <= num; i++)	{
			System.out.println(firstTerm+ " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int num = sc.nextInt();
		System.out.println("Fibonacci Series is : ");
		fibonacci(num);
		sc.close();
		
	}
}
