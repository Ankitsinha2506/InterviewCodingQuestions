package com.interview.codingquestions;

import java.util.Scanner;



public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a any Number : ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Series up to " + n + " terms : ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(fibonacci(i) + " ");
		}
		sc.close();
	}

	private static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

}
