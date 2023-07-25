import java.util.Scanner;


public class Main {
    // Function to check if a number is prime

    public static boolean Prime(int n,int divisor) {
        // Base case1 if the number is less than 2, it's not prime
        if (n < 2) {
            return false;
        }
        // Base case2 if the divisor reaches the square root of n, n is prime
        if (divisor> Math.sqrt(n)){
            return true;
        }
        // If n is divisible by any number between 2 and sqrt(n), it's not prime
        if (n%divisor == 0){
            return false;
        }
        // check the next divisor, by the Recursively methd
        return Prime(n,divisor+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int numberToCheck = scanner.nextInt();
        boolean PrimeNumber = Prime(numberToCheck,2);
        //function to check if the input number is prime
        if (PrimeNumber){
            System.out.println( "prime");
        }
        else{
            System.out.println( "composite");
        }

        scanner.close();
    }
}




