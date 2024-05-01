package com.interview.patterncodingquestions;

import java.util.Scanner;

public class RightTrainglePattern {
	public static void main(String[] args) {
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nmber of Rows you want to Print Pattern : ");
		int n = sc.nextInt();
		
		// Outer loop is used to handle Number of Rows.
		for(i = 0; i <= n; i++)
		{
			// Inner loop is used to handle number of columns
			for(j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			// Ending line after each row.
			System.out.println();
		}
		
		sc.close();
	}

}
