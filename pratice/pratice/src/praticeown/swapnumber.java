package praticeown;

public class swapnumber {
    public static void swapNumber(int a,int b){
       int temp = a;
        a = b;
        b = temp;
        System.out.println("Num1 :" + a);
        System.out.println("Num2 :" + b);
    }

    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        System.out.println("After swapping:");
        System.out.println("Num1 :" + a);
        System.out.println("Num2 :" + b);
        swapNumber(a, b);

    }
}
