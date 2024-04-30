package com.interview.codingquestions;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int originalNumber, reminder, result = 0, n = 0;
		originalNumber = number;
		
		// Sorting the Number of Digits
		while(originalNumber != 0)
		{
			originalNumber /= 10;
			++n;
		}
		
		originalNumber = number;
		// checking if number is Armstrong,
		while(originalNumber != 0)
		{
			reminder = originalNumber % 10;
			result += Math.pow(reminder, n);
			originalNumber /= 10;
			
		}
		
		if(result == number)
		{
			System.out.println(number + " is Armstrong Number");
		}
		else {
			System.out.println(number + " is not a Armstrong Number.");
		}
		
		
		sc.close();
	}

}
