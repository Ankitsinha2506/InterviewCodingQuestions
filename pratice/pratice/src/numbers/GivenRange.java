package numbers;

import java.util.Scanner;
public class GivenRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number of range:");
        int a = sc.nextInt();
        System.out.println("Enter Last Number of range:");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++)
            sum +=i;
        System.out.println("Sum of in given range is:" + sum);
    }
}
