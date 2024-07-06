package codingquwstions;

public class FirstOccurenceArray {

    public static int FirstOccurence(int arr[],int x) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                res = mid;
                end = mid -1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] ={1,2,5,8,8,8,8,10,11,12};
        int x = 8;
       int result  = FirstOccurence(arr,x);
       System.out.println("First Occurence is:" + result);
    }
}
