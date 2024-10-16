import java.util.Scanner;
import java.math.*;

public class basic_programs {
        // static int n1 = 0, n2 = 1, n3 = 0;
        // static void printFibo(int count) {
        //     if (count > 0) {
        //         n3 = n1 + n2;
        //         n1 = n2;
        //         n2 = n3;
        //         System.out.println(" " +n3);
        //         printFibo(count - 1); // recursive call for printFibo 
        //     }
        // }

        // static void checkPrime(int n){  
        //     int i,m=0,flag=0;      
        //     m=n/2;      
        //     if(n==0||n==1){  
        //      System.out.println(n+" is not prime number");      
        //     }else{  
        //      for(i=2;i<=m;i++){      
        //       if(n%i==0){      
        //        System.out.println(n+" is not prime number");      
        //        flag=1;      
        //        break;      
        //       }      
        //      }      
        //      if(flag==0)  { System.out.println(n+" is prime number"); }  
        //     }//end of else  
        //   } 
        
        // public static boolean isPrime(int n) {
        //     if (n <= 1) {
        //         return false;
        //     }
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }

        // public static boolean isPrime(int n) {  
        //     if (n <= 1) {  
        //         return false;  
        //     }  
        //     for (int i = 2; i <= Math.sqrt(n); i++) {  
        //         if (n % i == 0) {  
        //             return false;  
        //         }  
        //     }  
        //     return true;  
        // }  
         
    public static void main(String[] args) {

        // Java Basic Programs
        // (1.0) Fibonacci Series Without Using Recursion
        // int n1 = 0, n2 = 1, n3, i, count = 10;
        // System.out.println(n1+ " " +n2);// printing 0 and 1

        // for(i = 2; i < count; ++i) // loop start from zero as 0 and 1 are already printed
        // {
        //     n3 = n1 + n2;
        //     System.out.println(" " +n3);
        //     n1 = n2;
        //     n2 = n3; // dry run successful
        // }

        // (1.1) Fibonacci Series Using Recursion
        // int count = 10;
        // System.out.println(n1+ " " +n2); // printing 0 and 1
        // printFibo(count - 2); // n - 2 because 2 number are already printed

        // (2.0) Prime Number Basic Program
        // int i, m = 0, flag = 0;
        // int n = 3; // it is the number to be checked
        // m = n / 2;
        // if (n == 0 || n == 1) {
        //     System.out.println(n+ " is not prime number");
        // } else {
        //     for (i = 2; i <= m; i++) {
        //         if (n % i == 0) {
        //             System.out.println(n+ " is not prime number ");
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         System.out.println(n+ " is prime number");
        //     } // end of else
        // }

        // (2.1) Prime Number Program Using Method 
        // checkPrime(1);  
        // checkPrime(3);  
        // checkPrime(17);  
        // checkPrime(20);  

        // (2.2) Prime Number (Another Way) 
        // Scanner s = new Scanner(System.in);  
        // System.out.print("Enter a number : ");  
        // int n = s.nextInt();  
        // if (isPrime(n)) {  
        //     System.out.println(n + " is a prime number");  
        // } else {  
        //     System.out.println(n + " is not a prime number");  
        // }
        
        // (2.3) Prime Number B/W Two Numbers
        // Scanner s = new Scanner(System.in);  
        // System.out.print("Enter the first number : ");  
        // int start = s.nextInt();  
        // System.out.print("Enter the second number : ");  
        // int end = s.nextInt();  
        // System.out.println("List of prime numbers between " + start + " and " + end);  
        // for (int i = start; i <= end; i++) {  
        //     if (isPrime(i)) {  
        //         System.out.println(i);  
        //     }  
        // } 
        
        
    }
}
