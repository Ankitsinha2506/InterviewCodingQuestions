package praticeown;

public class countSum {
    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        int num = 1234;
        int result = sumDigit(num);
        System.out.println(result);
    }
}
