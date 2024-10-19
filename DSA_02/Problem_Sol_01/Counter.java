import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();

        Scanner val = new Scanner(System.in);
        System.out.print("Enter Value To Find Its Repetition Count : ");
        int val1 = val.nextInt();

        int count = 0, rem;
        while(n > 0) {
            rem = n % 10; // for last digit in number
            if (rem == val1) {
                count ++;
            }
            n = n / 10; // to separate out last digit from a number
        }
        System.out.println("Count for " +val1+ " is : "+count);
    }
}
