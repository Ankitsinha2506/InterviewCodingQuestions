package com.interview.ownpractise;

public class InsertionSort {
	
	public static void insertionSort(int arr[])	{
		for(int i = 0; i < arr.length; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j >= 0 && arr[j] > temp )	{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {7,5,9,4,6,7,6,8};
		insertionSort(arr);
		for(int i = 0; i < arr.length; i++)	{
			System.out.println(arr[i] + "");
		}
	}

}
