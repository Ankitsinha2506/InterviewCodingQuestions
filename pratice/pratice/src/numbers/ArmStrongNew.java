package numbers;

import java.util.Scanner;

public class ArmStrongNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        boolean ans = isArmstrong(num);
        if(!ans){
            System.out.println(num+" is not armstrong");
        }
        else {
            System.out.println(num+" is an Armstrong Number");
        }

    }
    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            int cube;
            cube = rem*rem*rem;
            sum += cube;
            num /= 10;
        }
        return original == sum;
    }
}
