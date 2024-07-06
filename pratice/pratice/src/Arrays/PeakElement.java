package Arrays;

public class PeakElement {
    public static int peakElement(int[] arr,int n){

        for (int i = 1; i < n-1; i++) {
            if (arr[i] >= arr[i+1]){
                return i;
            }
        }
        return n - 1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        int n = 3;
        int result = peakElement(arr,n);
        System.out.println(result);
    }
}
