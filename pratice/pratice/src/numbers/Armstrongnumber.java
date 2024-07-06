package numbers;
import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int n = num;
        int total = 0;
        int temp = 0;
        while ( n > 0){
            temp = n % 10;
            int cube = temp*temp*temp;
             total = total + cube;
             n = n / 10;
        }
        if (total == num){
            System.out.println("Number is armstrong number");
        }
        else {
            System.out.println("Number is not Amstrong");
        }
    }
}
