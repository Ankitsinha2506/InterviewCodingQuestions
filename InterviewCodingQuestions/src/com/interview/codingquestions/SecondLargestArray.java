package com.interview.codingquestions;

import java.util.Arrays;

public class SecondLargestArray {
	public static void main(String[] args) {
		int[] array = {10,6,7,5,3,5,12,85,35,57};
		Arrays.sort(array);
		
		int secondLargestArray  = array[array.length-2];
		
		System.out.println("Second Largest Array : " + secondLargestArray);
	}

}
