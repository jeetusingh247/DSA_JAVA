import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class is used to take input from the user
        System.out.print("Enter the Element to be searched: "); 
        int target = sc.nextInt();
        int[] numbers = {10, 20, 30, 40, 50};
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
