package numbers;

import java.util.Arrays;

public class largest2array {
    public static void main(String[] args){
        int arr[] = {11,22,21,33,30};
        Arrays.sort(arr);
        int res = arr[arr.length-2];
        System.out.println("Second largest :" + res);
    }
}
