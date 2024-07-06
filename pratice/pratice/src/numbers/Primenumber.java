package numbers;

import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
         if (n == 1){
             System.out.println(n);
             System.out.println("Not a prime number");
             return;
         }
         for (int i = 2; i < n ; i++){
             if (n % i == 0){
                 System.out.println("Not a prime number");
                 return;
             }
         }
         System.out.println("is a prime number");
    }
}
