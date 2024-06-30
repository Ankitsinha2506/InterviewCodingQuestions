package com.interview.ownpractise;

import java.util.Scanner;

public class CounrOddEven {
	
	public static int[] oddEvenCount(int num)	{
		int evenCount = 0;
		int oddCount = 0;
		
		while(num > 0)	{
			int digit = num%10;
			if(digit % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			
			num /= 10;
		}
		return new int[] {evenCount,oddCount};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		int[] result = oddEvenCount(num);
		System.out.println("EvenCOunt : "+result[0]);
		System.out.println("OddCount : "+ result[1]);
		sc.close();
		
	}

}
