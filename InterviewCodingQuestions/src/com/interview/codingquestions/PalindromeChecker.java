package com.interview.codingquestions;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check Palindrome or NOt ? : ");
		String str = sc.next();
		
		if(isPalindrome(str))
		{
			System.out.println(str + " is Palindrome.");
		}
		
		else {
			System.out.println(str + "  is Not Palindrome.");
		}
		sc.close();
	}

	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left < right)
		{
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
