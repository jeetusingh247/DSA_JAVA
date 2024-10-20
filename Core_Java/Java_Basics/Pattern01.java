import java.util.Scanner;
public class Pattern01{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // comment the working of all patterns below to see the output of each pattern


        // Left Triangle Star Pattern - 01

        // for(int i=1; i<=rows; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Inverted Left Triangle Star Pattern - 02

        // for(int i=1; i<=rows; i++){
        //     for(int j=rows; j>=i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Right Triangle Star Pattern - 03

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = rows; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted Right Triangle Star Pattern - 04

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = rows; k >= i; k--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Pyramid Star Pattern - 05

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = rows; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Inverted Pyramid Star Pattern - 06

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = rows; k >= i; k--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Hollow Pyramid Star Pattern
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = rows; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         if (k == 1 || k == i || i == rows)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // Inverted Hollow Pyramid Star Pattern - 07

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = rows; k >= i; k--) {
        //         if (k == rows || i == 1 || k == i)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        // Airplane Star Pattern - 08

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i || i == rows)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // } 


        // Diamond Shape Star Pattern - 09
        
        // int n = rows;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j > i; j--) {
        //     System.out.print(" ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = n - 1; i >= 1; i--) {
        //     for (int j = n; j > i; j--) {
        //     System.out.print(" ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Right Pascal Triangle Star Pattern - 10

        // Upper part of the Right Pascal Triangle
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Lower part of the Right Pascal Triangle
        // for (int i = rows - 1; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Left Pascal Triangle Star Pattern - 11
        // Upper part of the Left Pascal Triangle
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = rows; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower part of the Left Pascal Triangle
        // for (int i = 1; i <= rows - 1; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = rows - 1; k >= i; k--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Sandglass Star Pattern - 12
        // Upper part of the Sandglass Star Pattern
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = rows; k >= i; k--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Lower part of the Sandglass Star Pattern
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = rows - 1; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        
    }
}
