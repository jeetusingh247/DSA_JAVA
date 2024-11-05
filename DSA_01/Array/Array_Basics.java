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
import java.util.*;

public class Array_Basics {

    public static void main(String[] args) {
        // 1. Declaring an array
        int[] numbers; // This declares a variable numbers that holds a reference to an array of integers.

        // // 2. Instantiating an array
        numbers = new int[5]; // This creates an array that can hold 5 integers, actually here object is being created in the memory (heap) and reference is stored in numbers.

        // // 3. Initializing an array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // // 4. Accessing array elements
        System.out.println("First element: " + numbers[0]); // Output: First element: 10
        System.out.println("Second element: " + numbers[1]); // Output: Second element: 20

        // // 5. Iterating over an array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " , ");
        }
        System.out.println();

        // // Alternatively, using enhanced for loop
        System.out.println("All elements in the array (using enhanced for loop):");
        for (int number : numbers) {
            System.out.print(number + " , ");
        }
        System.out.println();

        // Problem 1: Find the maximum element in the array
        // int max = numbers[0];
        // for (int i = 1; i < numbers.length; i++) {
        //     if (numbers[i] > max) {
        //     max = numbers[i];
        //     }
        // }
        // System.out.println("Maximum element: " + max);
 
        // Problem 2: Calculate the sum of all elements in the array
        // int sum = 0;
        // for (int number : numbers) {
        //     sum += number;
        // }
        // System.out.println("Sum of all elements: " + sum);

        // Problem 3: Reverse the Sorted array
        // int[] reversed = new int[numbers.length];
        // for (int i = 0; i < numbers.length; i++) {
        //     reversed[i] = numbers[numbers.length - 1 - i];
        // }
        // System.out.print("Reversed array : ");
        // for (int number : reversed) {
        //     System.out.print(number + " , ");
        // }

        // Problem 4: Find the index of a specific element (e.g., 30)
        // int target = 30;
        // int index = -1;
        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] == target) {
        //     index = i;
        //     break;
        //     }
        // }
        // if (index != -1) {
        //     System.out.println("Element " + target + " found at index: " + index);
        // } else {
        //     System.out.println("Element " + target + " not found in the array.");
        // }

        // Problem 5: Check if the array contains a specific element (e.g., 25)
        // int target = 25;
        // boolean found = false;
        // for (int number : numbers) {
        //     if (number == target) {
        //     found = true;
        //     break;
        //     }
        // }
        // if (found) {
        //     System.out.println("Array contains the element : " + target);
        // } else {
        //     System.out.println("Array does not contain the element : " + target);
        // }

        // Problem 6: Rotate the array to the right by k steps (e.g., k = 2)
        int k = 2;
        int[] rotated = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rotated[(i + k) % numbers.length] = numbers[i];
        }
        System.out.println("Array rotated to the right by " + k + " steps:");
        for (int number : rotated) {
            System.out.println(number);
        }
/*
        // Problem 7: Find the subarray with the maximum sum (Kadane's Algorithm)
        int maxSoFar = numbers[0], maxEndingHere = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maxEndingHere = Math.max(numbers[i], maxEndingHere + numbers[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        System.out.println("Maximum sum of a subarray: " + maxSoFar);

        // Problem 8: Find the first missing positive integer
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            while (numbers[i] > 0 && numbers[i] <= n && numbers[numbers[i] - 1] != numbers[i]) {
            int temp = numbers[numbers[i] - 1];
            numbers[numbers[i] - 1] = numbers[i];
            numbers[i] = temp;
            }
        }
        int missing = n + 1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] != i + 1) {
            missing = i + 1;
            break;
            }
        }
        System.out.println("First missing positive integer: " + missing);

        // Problem 9: Find the longest increasing subsequence
        int[] lis = new int[numbers.length];
        int maxLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
            if (numbers[i] > numbers[j] && lis[i] < lis[j] + 1) {
                lis[i] = lis[j] + 1;
            }
            }
            if (maxLength < lis[i]) {
            maxLength = lis[i];
            }
        }
        System.out.println("Length of the longest increasing subsequence: " + maxLength);

        // Problem 10: Find the majority element (element that appears more than n/2 times)
        int count = 0, candidate = -1;
        for (int number : numbers) {
            if (count == 0) {
            candidate = number;
            count = 1;
            } else if (number == candidate) {
            count++;
            } else {
            count--;
            }
        }
        count = 0;
        for (int number : numbers) {
            if (number == candidate) {
            count++;
            }
        }
        if (count > numbers.length / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element found.");
        } */
    }
}