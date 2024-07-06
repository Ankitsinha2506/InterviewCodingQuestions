package Arrays;

public class PowerofTwo {
    public static boolean isPower(long n){
        if (n == 0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        long n = 10;
        boolean result = isPower(n);
        System.out.println(result);
    }

}
