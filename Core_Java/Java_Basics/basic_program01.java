import java.util.Random;
import java.util.Scanner;  
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom; 

public class basic_program01 {

    // static int factorial(int n){    
    //     if (n == 0)    
    //       return 1;    
    //     else    
    //       return(n * factorial(n-1));    
    //    }
    
    // function to check if the number is Armstrong or not  
    // static boolean isArmstrong(int n)   
    // {   
    // int temp, digits = 0, last = 0, sum = 0;   
    // // assigning n into a temp variable  
    // temp = n;   
    // // loop execute until the condition becomes false  
    // while(temp > 0)    
    // {   
    // temp = temp / 10;   
    // digits++;   
    // }   
    // temp = n;   
    // while(temp > 0)   
    // {   
    // // determines the last digit from the number      
    // last = temp % 10;   
    // // calculates the power of a number up to digit times and add the resultant to the sum variable  
    // sum +=  (Math.pow(last, digits));   
    // // removes the last digit   
    // temp = temp / 10;   
    // }  
    // // compares the sum with n  
    // if(n == sum)   
    // //returns if sum and n are equal  
    // return true;      
    // //returns false if sum and n are not equal  
    // else return false;   
    // }   
    
    
    // function to check if the number is Armstrong or not  
    // static boolean isArmstrong(int n)   
    // {   
    // int temp, digits=0, last=0, sum=0;   
    // // assigning n into a temp variable  
    // temp=n;   
    // // loop execute until the condition becomes false  
    // while(temp>0)    
    // {   
    // temp = temp/10;   
    // digits++;   
    // }   
    // temp = n;   
    // while(temp>0)   
    // {   
    // // determines the last digit from the number      
    // last = temp % 10;   
    // // calculates the power of a number up to digit times and add the resultant to the sum variable  
    // sum +=  (Math.pow(last, digits));   
    // // removes the last digit   
    // temp = temp/10;   
    // }  
    // // compares the sum with n  
    // if(n==sum)   
    // // returns if sum and n are equal  
    // return true;      
    // // returns false if sum and n are not equal  
    // else return false;   
    // }   
  

    public static void main(String[] args) {
        // (1.0) Palindrome Number
        // int r, sum = 0, temp;    
        // int n = 345543;//It is the number variable to be checked for palindrome  
        
        // temp = n;    
        // while(n>0){    
        //     r = n % 10;  // getting remainder  
        //     sum = (sum * 10) + r;    // logic 
        //     n = n / 10;    // value separation
        // }    
        // if(temp == sum)    
        //     System.out.println("palindrome number ");    
        // else    
        //     System.out.println("not palindrome");    
        // } 
        
        // (1.1) Palindrome (Another Way)
        // String original, reverse = ""; // Objects of String class  
        // Scanner in = new Scanner(System.in);   
        // System.out.println("Enter a string/number to check if it is a palindrome");  
        // original = in.nextLine();   
        // int length = original.length();   
        // for ( int i = length - 1; i >= 0; i-- )  
        //     reverse = reverse + original.charAt(i);  
        // if (original.equals(reverse))  
        //     System.out.println("Entered string/number is a palindrome.");  
        // else  
        //     System.out.println("Entered string/number isn't a palindrome.");   

        // (2.0) Factorial Program Using Loop 
        // int i, fact = 1;
        // int number = 4; // it is the number to calculate factorial
        // for (i = 1; i <= number; i++) {
        //     fact = fact * i;
        // } 
        // System.out.println("Factorial of "+number+" is : " +fact);

        // (2.1) Factorial Program Using Recursion 
        // int i, fact = 1;  
        // int number = 4; // It is the number to calculate factorial    
        // fact = factorial(number);   
        // System.out.println("Factorial of "+number+" is: "+fact);

        // (3.0) Armstrong Number -- > Note that there is no two-digit Armstrong number.
        // --> Armstrong Number always starts from 3-digits
        // int num;   
        // Scanner sc= new Scanner(System.in);  
        // System.out.print("Enter the limit: ");  
        // //reads the limit from the user  
        // num=sc.nextInt();  
        // System.out.println("Armstrong Number up to "+ num + " are: ");  
        // for(int i=0; i<=num; i++)  
        // //function calling  
        // if(isArmstrong(i))  
        // //prints the armstrong numbers  
        // System.out.print(i+ ", ");  

        // (3.1) Armstrong Number Example
        // int num;   
        // Scanner sc= new Scanner(System.in);  
        // System.out.print("Enter the number: ");  
        // //reads the limit from the user  
        // num=sc.nextInt();  
        // if(isArmstrong(num))  
        // {  
        // System.out.print("Armstrong ");  
        // }  
        // else   
        // {  
        // System.out.print("Not Armstrong ");  
        // } 
        
        // (4.0) Random Number (Example-1)
        // Generating random numbers  
        // System.out.println("1st Random Number: " + Math.random());   
        // System.out.println("2nd Random Number: " + Math.random());  
        // System.out.println("3rd Random Number: " + Math.random());   
        // System.out.println("4th Random Number: " + Math.random());

        // (4.1) Random Number (Example-2)
        // int min = 200;  
        // int max = 400;  
        // // Generate random double value from 200 to 400   
        // System.out.println("Random value of type double between "+min+" to "+max+ ":");  
        // double a = Math.random()*(max-min+1)+min; // mathematical formula to generate random number logically
        // System.out.println(a);  
        // // Generate random int value from 200 to 400   
        // System.out.println("Random value of type int between "+min+" to "+max+ ":");  
        // int b = (int)(Math.random()*(max-min+1)+min);  
        // System.out.println(b);  

        // (4.2) Using the Random Class (Example-3)
        // creating an object of Random class   
        // Random random = new Random();   
        // // Generates random integers 0 to 49  
        // int x = random.nextInt(50);   
        // // Generates random integers 0 to 999  
        // int y = random.nextInt(1000);   
        // // Prints random integer values  
        // System.out.println("Randomly Generated Integers Values");  
        // System.out.println(x);   
        // System.out.println(y);   
        // // Generates Random doubles values  
        // double a = random.nextDouble();   
        // double b = random.nextDouble();   
        // // Prints random double values  
        // System.out.println("Randomly Generated Double Values");  
        // System.out.println(a);   
        // System.out.println(b);    
        // // Generates Random float values  
        // float f = random.nextFloat();  
        // float i = random.nextFloat();  
        // // Prints random float values  
        // System.out.println("Randomly Generated Float Values");  
        // System.out.println(f);   
        // System.out.println(i);   
        // // Generates Random Long values  
        // long p = random.nextLong();   
        // long q = random.nextLong();   
        // // Prints random long values  
        // System.out.println("Randomly Generated Long Values");  
        // System.out.println(p);   
        // System.out.println(q);    
        // // Generates Random boolean values  
        // boolean m = random.nextBoolean();  
        // boolean n = random.nextBoolean();  
        // // Prints random boolean values  
        // System.out.println("Randomly Generated Boolean Values");  
        // System.out.println(m);   
        // System.out.println(n); 

        // (4.3) ThreadLocalRandom (Example-4)
        // Generate random integers between 0 to 999   
        int a = ThreadLocalRandom.current().nextInt();   
        int b = ThreadLocalRandom.current().nextInt();   
        // Print random integer values  
        System.out.println("Randomly Generated Integer Values:");  
        System.out.println(a);   
        System.out.println(b);   
        // Generate Random double values  
        double c = ThreadLocalRandom.current().nextDouble();   
        double d = ThreadLocalRandom.current().nextDouble();   
        // Print random doubles   
        System.out.println("Randomly Generated Double Values:");  
        System.out.println(c);   
        System.out.println(d);   
        // Generate random boolean values  
        boolean e = ThreadLocalRandom.current().nextBoolean();   
        boolean f = ThreadLocalRandom.current().nextBoolean();   
        // Print random Booleans   
        System.out.println("Randomly Generated Boolean Values:");  
        System.out.println(e);   
        System.out.println(f);     
    }  
}    

