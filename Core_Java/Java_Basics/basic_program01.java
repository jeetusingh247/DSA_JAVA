import java.util.Scanner;  
import java.lang.Math;  

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
    static boolean isArmstrong(int n)   
    {   
    int temp, digits=0, last=0, sum=0;   
    // assigning n into a temp variable  
    temp=n;   
    // loop execute until the condition becomes false  
    while(temp>0)    
    {   
    temp = temp/10;   
    digits++;   
    }   
    temp = n;   
    while(temp>0)   
    {   
    // determines the last digit from the number      
    last = temp % 10;   
    // calculates the power of a number up to digit times and add the resultant to the sum variable  
    sum +=  (Math.pow(last, digits));   
    // removes the last digit   
    temp = temp/10;   
    }  
    // compares the sum with n  
    if(n==sum)   
    // returns if sum and n are equal  
    return true;      
    // returns false if sum and n are not equal  
    else return false;   
    }   
  

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
        int num;   
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter the number: ");  
        //reads the limit from the user  
        num=sc.nextInt();  
        if(isArmstrong(num))  
        {  
        System.out.print("Armstrong ");  
        }  
        else   
        {  
        System.out.print("Not Armstrong ");  
        }  



        

    }  
}    

