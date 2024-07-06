package com.interview.ownpractise;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean isNumber(int num) {
		int revNum = 0;
		int z = num;
		while (num > 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num/10;
		}
		
		return revNum == z;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number to check Number Is Palindrome or NOt ?");
		int num = sc.nextInt();
		if(isNumber(num))	{
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is Not Palindrome");
		}
		sc.close();
	}

}
