package praticeown;
import java.util.Scanner;

public class countdigit {
    public static int countDigit(int num){
        int count = 0;
        while ( num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int result = countDigit(num);
        System.out.println(result);
        sc.close();
    }
}
