
package com.interview.ownpractise;

public class RevString {
	public static String reverseString(String str) {
		String revstr = "";
		for(int i=str.length()-1; i>=0; i--)	{
			revstr = revstr + str.charAt(i);
		}
		return revstr;
	}
	public static void main(String[] args) {
		String str = "Ankit";
		String result = reverseString(str);
		System.out.println(result);
	}

}
