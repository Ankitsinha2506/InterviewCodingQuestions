package com.interview.ownpractise;

/* 
 	* In BubbleSort, Array is transvered from first element to last elements. Here current element is
 	* compared with next element. If current element is greater than next element. then its swapped.
*/	

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {4,5,2,9,7,4,2,87,45,35,25};
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

}
