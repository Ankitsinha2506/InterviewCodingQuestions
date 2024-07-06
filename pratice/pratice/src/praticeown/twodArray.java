package praticeown;

public class twodArray {
    public static int t2dArray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

        }
        return  sum;
    }
    public static void main(String[] args){
     int[][] arr = {{0,1,2,4,5},{3,4,5,6,7},{5,6,7,8,9}};
     System.out.print(t2dArray(arr));
    }
}
