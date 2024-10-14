public class minArray {
    // --> Algorithm to find minimum of array
    public static int findminimum(int[] arr) {

        // Handling Exception
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input From User");
        }

        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    // --> Algorithm to printArray
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    } 

    public static void main(String[] args) {
        int[] num = {5, 4, 8, 9, 2, 6, 1};
        printArray(num);
        int a = findminimum(num);
        System.out.println("Minimum Value is " + a);

    }
}
