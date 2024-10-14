public class RemoveEvenInteger {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + ' ');
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 45, 67, 81};
        printArray(arr);
        System.out.println("Array After Removing Even Integers");
        int[] result = removeEven(arr);
        printArray(result);

    }
}