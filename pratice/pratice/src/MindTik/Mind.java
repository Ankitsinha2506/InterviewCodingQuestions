package MindTik;

import java.util.Arrays;

public class Mind {
    public static void main(String[] args) {
        int[] arr1 = {15,13,11,9,7,5};
        int[] arr2 = {27,23,21,19,17,16,15,11,10,8,6};
        int ptr1 = arr1.length - 1;
        int ptr2 = arr2.length - 1;
        int[] arr3 = new int[ptr1 + ptr2 + 2];
        int i = 0;

        while(ptr1 >= 0 && ptr2 >= 0){
            if (arr1[ptr1] > arr2[ptr2]){
                arr3[i] = arr2[ptr2];
                ptr2--;
            }
            else {
                arr3[i] = arr1[ptr1];
                ptr1--;
            }
            i++;
        }

        while(ptr1 >= 0){
            arr3[i] = arr1[ptr1];
            ptr1--;
            i++;
        }

        while(ptr2 >= 0){
            arr3[i] = arr2[ptr2];
            ptr2--;
            i++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
