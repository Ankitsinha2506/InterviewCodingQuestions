package com.interview.patterncodingquestions;

import java.util.Scanner;

public class LeftTrianglePattern {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		// Take Input from User.
		System.out.println("Enter Numbe of Rows you want to print : ");
		int n = sc.nextInt();
		
		// Outer loop for hanle Number of Rows.
		for(i = 0; i < n; i++)
		{
			// Loop to print Spaces.
			for(j = 2 * (n-i-1); j >= 0; j--)
			{
				System.out.print(" ");
			}
			
			// Loop to print Stars.
			for(j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
