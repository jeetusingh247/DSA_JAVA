public class resizeArray {

    // Algorithm to print an array
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    // algo to resize array
    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        resizeArray arr1 = new resizeArray();
        int[] original = new int[] {5, 1, 2, 6, 7};
        System.out.println("Size of Original Array is : " + original.length);
        original = arr1.resize(original, 7);
        System.out.println("size of array after modified : " + original.length);

    }




}