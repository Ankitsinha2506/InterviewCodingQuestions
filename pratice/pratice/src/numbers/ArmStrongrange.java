package numbers;
import java.util.Scanner;
public class ArmStrongrange {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number to be in Range");
        int n1 = sc.nextInt();
        System.out.println("Enter Last Number to be in Range");
        int n2 = sc.nextInt();

        for (int i = n1 ; i < n2 ; i++){
            int sum = 0;
            int check = 0;
            check=i;

            while ( check > 0){
                int rem = check %10;
                int cube = rem * rem * rem;
                sum += cube;
                check = check/10;
            }
            if (sum == i) {
                System.out.println("" + i + "is an armstrong number:");
            }
        }

    }
}
