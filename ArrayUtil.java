// import java.util.concurrent.ArrayBlockingQueue;

public class ArrayUtil {
   // --> print algo code
 public void printArray(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
        System.out.println(arr[i] + " ");
    }
    // System.out.println();
 }
 public void arrayDemo(){
    int[] myArray = new int[5]; // default values // 0 1 2 3 4 
    myArray[0] = 5;
    myArray[1] = 3;
    myArray[2] = 4;
    myArray[3] = 5;
    myArray[4] = 15;
    myArray[2] = 8; // updated value
    // myArray[5] = 8; // updated value
    printArray(myArray);
    // myArray[6] = 5;
    System.out.println(myArray.length);
    System.out.println(myArray[myArray.length - 1]); // to access the last element of this array
    System.out.println("Used Defined Array");
    int[] arr = {5, 24, 34, 7, 22};
    printArray(arr);
 }   
 public static void main(String[] args) {
   ArrayUtil arrUtil = new ArrayUtil();
   arrUtil.arrayDemo(); 
 }
}
