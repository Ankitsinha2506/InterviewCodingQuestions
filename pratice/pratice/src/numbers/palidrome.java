package numbers;

import java.util.Scanner;
public class palidrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; --i){
            revStr = revStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println("String is numbers.palidrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
