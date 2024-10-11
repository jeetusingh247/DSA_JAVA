public class resizeArray {
    // --> Algorithm to resize an array
    public static void resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    // --> Algorithm to print an array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("before resize" + arr.length);
        resize(arr, 9);
        System.out.println("after resize" + arr.length);
    }
}
