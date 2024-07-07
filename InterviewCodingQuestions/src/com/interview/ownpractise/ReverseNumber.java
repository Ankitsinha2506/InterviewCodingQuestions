package com.interview.ownpractise;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverseNumber(int a)	{
		int revnum = a;
		while(a > 0) {
			int digit = a % 10;
			revnum = revnum * 10 + digit;
			a = a/10;
		}
		return revnum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		int result = reverseNumber(a);
		System.out.println("Reverse Number : "+ result);
		
		sc.close();
	}

}
