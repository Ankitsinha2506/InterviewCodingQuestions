package com.interview.ownpractise;

import java.util.Scanner;

public class SwapNumber {
	public static void swapNumber(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("First Number :" + num1 + " Second Number : "+num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swapping : ");
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("Afrer Swapping : ");
		swapNumber(num1, num2);
	}

}
