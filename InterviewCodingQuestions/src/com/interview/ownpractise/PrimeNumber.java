package com.interview.ownpractise;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num)	{	
		boolean ans = true;
		if(num==1) {
			ans=false;
		}
		for(int i=2;i<num;i++)	{
			if(num%i==0) {
				ans=false;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int num  = sc.nextInt();
		
		if (isPrime(num)) {
			System.out.println("Number is Prime.");
		} else	{
			System.out.println("Number is not Prime.");
		}
		sc.close();
	}

}
