package com.interview.codingquestions;

import java.util.Scanner;



public class FactorialNumber {
	
	public static int getFact(int number)
	{
		if(number == 1 || number == 0)
			return 1;
		
		return number * getFact(number - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		
		if(number >= 0)
		{
			System.out.println(number + " Factorial : " + getFact(number));
		}
		else
			System.out.println(" Negative Number : No Factorial");
		
		sc.close();
	}

}
