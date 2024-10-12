public class findMissingNum {

    // --> Algorithm to find missing number 
    public static int MissingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1))/2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    // --> Algo to print array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 8, 6, 3, 7};
        int a = MissingNum(arr1);
        System.out.println("Missing value is : " + a); // --> gives 5 as the missing value
    }

}
