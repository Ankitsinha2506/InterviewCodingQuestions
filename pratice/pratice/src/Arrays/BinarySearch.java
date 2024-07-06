package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr,int x){

        int res = 0;
        int start  = 0;
        int end = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            int mid = start + (end  - start)/2;

            if (arr[mid] == x){
                res = mid;
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,5,7,9,15,18,20,40,45,50};
        int x = 7;
        int result = binarySearch(arr,x);
        System.out.println(result);
    }
}
