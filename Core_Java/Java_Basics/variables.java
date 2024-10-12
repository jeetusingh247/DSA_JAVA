public class variables {
    static int m = 100; // static variable
    void method() {
        int n = 90; // local variables
        System.out.println("this is a local variable : " + n);
    }
    public static void main(String args[]) {
        int data = 50; // instance variable
        System.out.println("this is an instance variable : " + data);

        int a = 10; // instance variable
        int b = 30; // instance 
        System.out.println("Sum is : "+ (a + b));

        float c = a + b; // Expanding
        System.out.println("Type Conversion Int to float : " + c);

        float f = 10.5f; 
        // int a1 = f;  --> compile time error
        int a1 = (int)f; // Narrowing(TypeCasting)
        System.out.println(f);
        System.out.println(a1);

        int a2 = 130;
        byte b3 = (byte)a2; // Overflow
        System.out.println(a2);
        System.out.println(b3);

        byte a4 = 10;
        byte b4 = 10;
        // byte c4 = a + b; --> Compile time error : because a + b = 20 wiil be int
        byte c4 = (byte)(a4 + b4);
        System.out.println("Ans is : " + c4);
    }
}// end of class

