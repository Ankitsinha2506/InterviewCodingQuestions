package com.interview.ownpractise;

// BinarySearch is a key used to search key elements from multiple elements.

public class BinarySearch {
    public static int binarySearch(int arr[],int findNums){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid]  > findNums){
                end = mid - 1;
            } else if (arr[mid] < findNums) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,3,5,7,9,14,17,19,33};
        int xfindNums =33;
        int result = binarySearch(arr,xfindNums);
        System.out.println(result);

    }
}
