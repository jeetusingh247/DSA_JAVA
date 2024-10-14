
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
        // Example 1
        int x2 = 10;
        int y2 = 5;
        int z2 = 20;
        System.out.println(x2 > y2 || x2 < z2); // true || true = true
        System.out.println(x2 > y2 | x2 < z2); // true | true = true
        System.out.println(); // | VS |
        System.out.println(x2 > y2 || x2++ < z2); // true || true = true
        System.out.println(x2); // 10 because second condition is not checked
        System.out.println();
        System.out.println(x2 > y2 | x2++ < z2); // true | true = true
        System.out.println(x2); // 11 because second condition is also checked
        System.out.println();

        // (6) Java Ternary Operator
        // Example 1
        int x3 = 2;
        int y3 = 5;
        int min = (x3 < y3) ? x3 : y3; // --> ternary operator which takes three operands
        System.out.println(min); // 2

        // (7) Java Assignment Operator
        // Example 1
        int a7 = 20;
        int b7 = 30;
        a += 4; // a7 = a7 + 4 (a7 = 20 + 4)
        b -= 4; // b7 = b7 - 4 (b7 = 30 - 4)
        System.out.println(a7);
        System.out.println(b7);
        System.out.println();

        // Example 2
        int d2 = 20;
        d2 += 4; // 20 + 4
        System.out.println(d2); // 24
        d2 -= 4; // 24 - 4
        System.out.println(d2); // 20
        d2 *= 2; // 20 * 2
        System.out.println(d2); // 40
        d2 /= 10; // 40 / 10
        System.out.println(d2); // 4
        System.out.println();

        // Example 3 --> Adding Sort
        // short s = 10;
        // short s2 = 10;
        // s = s + s2; // Compile time error because 10 + 10 = 20 now integer
        // System.out.println(s);

        // After TypeCast
        short s = 10;
        short s2 = 10;
        s = (short)(s + s2); // 20 which is now converted to short
        System.out.println(s);



    }
}
