package numbers;
import java.util.Scanner;
public class Palindromenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number:");
        int n  = sc.nextInt();
        int rev = 0;
         int z = n;
        while (n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }
        if (rev == z){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not a Palindrome");
        }
    }
}
