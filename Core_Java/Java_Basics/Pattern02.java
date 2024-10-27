import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        // Number Patterns

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        // Number Pattern - 01
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 02
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 03
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - i + 1 + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 04
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - j + 1 + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 05
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + j - 1 + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 06
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - i + j + " ");
        //     }
        //     System.out.println();
        // }

        // // Number Pattern - 07
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - j + i + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 08
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + rows - j + " ");
        //     }
        //     System.out.println();
        // }

        // Number Pattern - 09
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // // Number Pattern - 10
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // // Number Pattern - 11
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - i + 1 + " ");
        //     }
        //     System.out.println();
        // }

        // // Number Pattern - 12
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - j + 1 + " ");
        //     }
        //     System.out.println();
        // }
        
        // // Number Pattern - 13
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i + j - 1 + " ");
        //     }
        //     System.out.println();
        // }
        
        // // Advanced Number Patterns
        // // Number Pattern - 14
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - i + j + " ");
        //     }
        //     System.out.println();
        // }   

        // // Number Pattern - 15
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(rows - j + i + " ");
        //     }
        //     System.out.println();
        // }   

        // // Number Pattern - 16
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     for (int j = i - 1; j >= 1; j--) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // // Number Pattern - 17
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        

        

    }
}
