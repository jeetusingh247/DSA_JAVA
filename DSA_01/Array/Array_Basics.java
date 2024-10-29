/**
 * This class demonstrates the basics of arrays in Java.
 * 
 * An array is a data structure that can store a fixed-size sequential collection of elements of the same type.
 * It is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
 * Instead of declaring individual variables, such as number0, number1, ..., and number99, you declare one array variable such as numbers and use numbers[0], numbers[1], ..., and numbers[99] to represent individual variables.
 * This tutorial will cover the following topics:
 * 1. Declaring an array
 * 2. Instantiating an array
 * 3. Initializing an array
 * 4. Accessing array elements
 * 5. Iterating over an array
 */
public class Array_Basics {

    public static void main(String[] args) {
        // 1. Declaring an array
        int[] numbers;

        // 2. Instantiating an array
        numbers = new int[5]; // This creates an array that can hold 5 integers

        // 3. Initializing an array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 4. Accessing array elements
        System.out.println("First element: " + numbers[0]); // Output: First element: 10
        System.out.println("Second element: " + numbers[1]); // Output: Second element: 20

        // 5. Iterating over an array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Alternatively, using enhanced for loop
        System.out.println("All elements in the array (using enhanced for loop):");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}