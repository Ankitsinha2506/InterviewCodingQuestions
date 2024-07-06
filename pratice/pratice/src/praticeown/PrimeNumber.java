package praticeown;

public class PrimeNumber {
    public static boolean isPrime(int num){
        boolean ans = true;
        if(num == 1){
            ans =  false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                 ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int num =  21;
        if (!isPrime(num)){
            System.out.println("Number is not prime");
        }
        else {
            System.out.println("Number is prime");
        }

    }
}
