package com.interview.ownpractise;

import java.util.Scanner;

public class PalindromeString {
	
	public static boolean isPalindrome(String str) {
		String revStr = "";
		boolean ans = false;
		for(int i = str.length()-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		if (str.equals(revStr)) {
			ans = true;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "ankit";
		str = str.toLowerCase();
		
		if(isPalindrome(str))	{
			System.out.println(str + " String is Palindrome");
		} else {
			System.out.println(str + " String is Not Palindrome");
		}
	}

}
