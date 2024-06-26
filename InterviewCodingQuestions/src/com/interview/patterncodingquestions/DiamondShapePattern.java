package com.interview.patterncodingquestions;

import java.util.Scanner;

public class DiamondShapePattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows you want to print : ");
		int n = sc.nextInt();
		
		int sp = n-1;
		// Run loop (Parent loop) till number of Rows.
		for(int i = 0; i < n ; i++)
		{
			// Loop for initial Space.
			for(int j = 0; j < sp; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
			sp--;
		}
		
		// Repeat Again to print in Reverse Order,
		for(int i = n; i > 0; i--)
		{
			// Loop for initial Space.
			sp = 0;
			for(i = n; i > 0; i++)
			{
				// Loop for initial Space.
				for(int j = 0; j < sp; j++)
				{
					System.out.print("");
				}
			}
		}
		
		
		sc.close();
		
		
	}

}
