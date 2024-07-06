package numbers;
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be Power:");
        int n = sc.nextInt();
        System.out.println("Enter a base number");
        int a  = sc.nextInt();
        int result = 1;

        for (int i = 0; i < n; i++){
            result = result * a;
        }
        System.out.println("Power of number is:" + result);
    }
}
