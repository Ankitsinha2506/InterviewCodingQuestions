package com.interview.ownpractise;

import java.util.Scanner;

public class CountSum {
	
	public static int sumDigit(int num) {
		int sum = 0;
		while(num > 0)	{
			int digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to sum : ");
		int num = sc.nextInt();
		int result = sumDigit(num);
		System.out.println(result);
		sc.close();
	}

}
