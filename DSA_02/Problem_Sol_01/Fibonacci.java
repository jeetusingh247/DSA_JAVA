import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();

        System.out.println("Fibonacci at "+ n +" = " + fibonacci(n)); // Time Complexity  :  O(1)
    }

    public static int fibonacci(int n) {
        double phi = (1 + Math.sqrt(5)) / 2; // golden ratio
        return (int) Math.round((Math.pow(phi, n) - Math.pow(1 - phi, n)) / Math.sqrt(5)); // binets formula 
    }
}
