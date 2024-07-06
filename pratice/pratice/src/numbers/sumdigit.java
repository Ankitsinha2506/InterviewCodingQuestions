package numbers;

import java.util.Scanner;
public class sumdigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum=0;
        int digit=0;
        while (n > 0){
            digit= n % 10;
            sum = sum + digit;
            n = n /10;
        }
          System.out.println("Sum of Digit will be:"+sum);
    }
}
