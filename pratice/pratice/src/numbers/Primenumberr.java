package numbers;

import java.util.Scanner;
public class Primenumberr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be first in range");
        int a = sc.nextInt();
        System.out.println("Enter a number to be prime");
        int b = sc.nextInt();
        if (b == 1){
            System.out.println("Not a Prime Number");
            return;
        }
        for (int i = a; i < b ; i++){
            if (b % i == 0){
                System.out.println("Not a Prime Number");
            }
        }
        System.out.println("Prime Number");
    }
}
