package com.interview.codingquestions;

public class swapNumbers {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		System.out.println("A : "+ a + " B : "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping, a is : " +a + " and b is : "+b);
	}

}
