// --> move zeroth elements to end of an array

public class MoveZeroes {

    // --> to print the array

    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // --> demo algorithm

    public void arrayDemo() {
        int[] arr = {8, 0, 3, 0, 5, 9};
        printArray(arr);
        moveZeros(arr, arr.length);
        printArray(arr);
    }

    // --> this algo moves all zeroes to last of array

    public void moveZeros(int[] arr, int n) {
        int j = 0; //focus on zeroth element
        for (int i = 0; i < n; i++) { // will focus on no zero elements
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
    // --> main
    public static void main(String[] args) {
        MoveZeroes arrUtil = new MoveZeroes();
        arrUtil.arrayDemo();
    }
}
