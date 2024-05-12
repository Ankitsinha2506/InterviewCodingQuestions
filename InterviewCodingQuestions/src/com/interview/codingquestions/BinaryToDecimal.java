package com.interview.codingquestions;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Binary Number : ");
		int binary = sc.nextInt();
		
		int decimal = 0;
		int num = 0;
		while(binary > 0)
		{
			int temp = binary % 10;
			decimal += temp*Math.pow(2, num);
			binary = binary / 10;
			num++;
		}
		
		System.out.println("Binary Number : "+decimal);
		sc.close();
		
		
	}

}
