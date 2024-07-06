package numbers;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i < n; i++){
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            System.out.print(firstTerm + " ");
        }
    }
}
