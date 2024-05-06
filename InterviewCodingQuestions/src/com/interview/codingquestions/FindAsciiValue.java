package com.interview.codingquestions;

import java.util.Scanner;

public class FindAsciiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char character = sc.next().charAt(0);
		
		// TypeCasting from Character to Integer Type.
		int i = character;
		
		// Printing ASCII Value of the Character.
		System.out.println(" ASCII Value of "+character + " is : " +i);
		sc.close();
	}

}
