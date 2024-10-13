
// --> Operator in Java is a symbol that is used to perform operations.
// --> For Example : +, -, *, / etc.

public class operators {
    public static void main(String[] args) { // --> method signature
         
        // --> Java Operator Along Opertors-Precedence

        // (1) Unary Operator
        // Example 1

        int x = 10;
        System.out.println(x++); // 10 (11)
        System.out.println(++x); // 12
        System.out.println(x--); // 12 (11)
        System.out.println(--x); // 10
        System.out.println();

        // Example 2

        int a = 10;
        int b = 20;
        System.out.println(a++ + ++a); // 10 + 12  = 22
        System.out.println(b++ + b++); // 20 + 21 = 41
        System.out.println();

        // Example 3

        int a1 = 10;
        int b1 = -20;
        boolean c = true;
        boolean d = false;
        System.out.println(~a1); // --> -11 (minus of total positive value which starts from 0)
        System.out.println(~b1); // --> 19 (positive of total minus, positive starts from 0)
        System.out.println(!c); // false (opposite of boolean value)
        System.out.println(!d); // true
        System.out.println();

        // (2) Arithmetic Operator
        // Example 1

        int x1 = 20;
        int y1 = 23;
        System.out.println(x1 + y1); // --> 43
        System.out.println(x1 - y1); // --> -3
        System.out.println(x1 * y1); // --> 460
        System.out.println(x1 / y1); // --> 0
        System.out.println(x1 % y1); // --> 20

        // Example 2
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // --> 21
        System.out.println();

        // (3) Shift Operator
        // Left Shift

        System.out.println(10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40
        System.out.println(10 << 3); // 10 * 2 ^ 3 = 10 * 8 = 80
        System.out.println(20 << 2); // 20 * 2 ^ 2 = 20 * 4 = 80
        System.out.println(15 << 4); // 15 * 2 ^ 4 = 15 * 16 = 240
        System.out.println();

        // Right Shift

        System.out.println(10 >> 2); // 10 / 2 ^ 2 = 10 / 4 = 2  
        System.out.println(20 >> 2); // 20 / 2 ^ 2 = 20 / 4 = 5  
        System.out.println(20 >> 3); // 20 / 2 ^ 3 = 20 / 8 = 2  
        System.out.println();

        // For positive number, >> and >>> works same

        System.out.println(20 >> 2);  
        System.out.println(20 >>> 2);  

        // For negative number, >>> changes parity bit (MSB) to 0 

        System.out.println(-20 >> 2);   // -5
        System.out.println(-20 >>> 2);  // 1073741819

        // (4) Java AND Operator Example: Logical && and Bitwise &
        // Example 1

        int a5 = 10;  
        int b5 = 5;  
        int c5 = 20;  
        System.out.println(a5 < b5 && a5 < c5); // false && true = false  
        System.out.println(a5 < b5 & a5 < c5); // false & true = false 
        System.out.println();
        
        // Example 2

        int a6 = 10;  
        int b6 = 5;  
        int c6 = 20;  
        System.out.println(a6 < b6 && a6++ < c6); // false && true = false  
        System.out.println(a6); // 10 because second condition is not checked  
        System.out.println(a6 < b6 & a6++ < c6); // false && true = false  
        System.out.println(a6); // 11 because second condition is checked 
        System.out.println();

        // (5) Java OR Operator Example: Logical || and Bitwise |

    }
}
