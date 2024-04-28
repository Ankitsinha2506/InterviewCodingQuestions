package com.interview.codingquestions;

// Java Program to Reverse String
// Palindrome
// Prime or Not
// Fibonacci Series
// Odd even
// Natural Numbers
// 
public class ReverseString {
	
	public static void main(String[] args) {
		String original = "Ankit Lal Sinha";
		String sb = reverseString(original);
		System.out.println("Original String : " +original);
		System.out.println("Reverse String : " +sb);
		
	}

	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i >= 0; i--)
		{
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
