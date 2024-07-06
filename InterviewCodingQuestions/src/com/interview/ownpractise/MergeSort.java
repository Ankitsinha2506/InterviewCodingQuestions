package com.interview.ownpractise;

public class MergeSort {
	public static int[] mergeSort(int[] arr1, int[] arr2)	{
		int i=0;
		int j=0;
		int k=0;
		
		int ans[] = new int[arr1.length + arr2.length];
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[i]) {
				ans[k]=arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr1[i];
				j++;
				k++;
			}
		}
		while(i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length) {
			j++;
			k++;
		}
		return ans;	
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,5,9,7,6};
		int arr2[] = {4,5,8,3,2};
		
		int ans[] = mergeSort(arr1, arr2);
		for(int i = 0; i < ans.length; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}

}
