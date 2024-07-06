package numbers;

import java.util.Scanner;
public class greatest3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int a2 = sc.nextInt();
        System.out.println("Enter Number 3");
        int a3 = sc.nextInt();

        if (a1 > a2 && a1 >a3){
            System.out.println("a1 is greater");
        }
        else if (a2 > a1 && a2 > a3) {
            System.out.println("a2 is greater");
        }
        else {
            System.out.println("a3 is greater");
        }
    }
}
