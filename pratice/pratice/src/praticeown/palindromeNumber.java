package praticeown;
import java.util.Scanner;
public class palindromeNumber {
    public static boolean isNumber(int num){
        int revNum = 0;
        int z = num;
        while (num > 0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num/10;
        }
        return revNum == z;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if (isNumber(num)){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }

    }
}
