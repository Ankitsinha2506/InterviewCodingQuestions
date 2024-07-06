package praticeown;

public class insertionSort {
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int j = i -1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args){
        int arr[] = {9,8,5,6,2,1};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
