package praticeown;

public class Fibonacciseries {
    public static void fibonacci(int n){
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm + "");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;


        }

    }
    public static void main(String[] args){
     int n = 5;
     System.out.println("Fibonacci Series:");
     fibonacci(n);
    }
}
