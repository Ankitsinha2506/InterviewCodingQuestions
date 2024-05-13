package com.interview.patterncodingquestions;

import java.util.Scanner;

public class SimpleNumberProgram {
	
	public static void printNums(int n)
	{
		int i, j, num = 0;
		
		// Outer loop for rows.
		for(i = 0; i < n; i++)
		{
			// Inner loop for rows.
			for(j = 0; j < i; j++)
			{
				// Printing Number with space,
				System.out.print(num + " ");
				// Increment value of num,
				num++;
			}
			
			// ending line after each row.
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Numbers : ");
		int n = sc.nextInt();
		printNums(n);
		sc.close();
		
	}
}
