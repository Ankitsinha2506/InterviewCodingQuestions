package com.interview.patterncodingquestions;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int n  = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			// Inner loop is used to handle Number of Spaces.
			for(int j = n-i; j > 1; j--)
			{
				System.out.print(" ");
			}
			
			// The Inner loop is used to handle of the column.
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
