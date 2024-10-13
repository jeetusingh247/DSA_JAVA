// --> primitive data types - boolean, char, byte, short, int, long, float and double.
// --> nonprimitive data types - Classes, interfaces and Arrays.
// --> Java is statically typed programming language


public class dataTypes { // --> we have seen some non-primitive dataTypes earlier
    public static void main(String[] args) {

        // --> primitive dataTypes

        Boolean one = false;
        System.out.println(one.getClass()); // boolean type class
        

        byte a = 10;
        byte b = -20;
        System.out.println("This is a byte add " + (a + b)); // byte dataType
        System.out.println("Byte Type Minimum Value: " + Byte.MIN_VALUE); // -128
        System.out.println("Byte Type Maximum Value : " + Byte.MAX_VALUE); // 127
        System.out.println();
        
        short a1 = 30;
        short b1 = 56;
        System.out.println("This is short add " + (a1 + b1)); // short dataType
        System.out.println("Short Type Minimum Value: " + Short.MIN_VALUE); // -32768
        System.out.println("Short Type Maximum Value : " + Short.MAX_VALUE); // 32767
        System.out.println();

        int a3 = 67;
        int b3 = 98;
        System.out.println("This is Integer add " + (a3 + b3)); // integer dataType
        System.out.println("Int Type Minimum Value: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Int Type Maximum Value : " + Integer.MAX_VALUE); // 2147483647
        System.out.println();
        
        long a4 = 10000000000L;
        long b4 = 20000000000L;
        System.out.println("Long addition " + (a4 + b4)); // long dataType
        System.out.println("Long Type Minimum Value: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Long Type Maximum Value : " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println();
        
        float a5 = 1000.25f;
        float b5 = 234.5f;
        System.out.println("Float addition " + (a5 + b5)); // float dataType
        System.out.println("Float Type Minimum Value: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Float Type Maximum Value : " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println();
        
        double d1 = 12.3; // double dataType
        System.out.println("Double : " + d1);
        System.out.println("Double Type Minimum Value: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Double Type Maximum Value : " + Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println();
        
        char c1 = 'A';
        System.out.println("Character : " + c1); // char dataType
        System.out.println("Char Type Minimum Value: " + Character.MIN_VALUE); // 
        System.out.println("Char Type Maximum Value : " + Character.MAX_VALUE); // ?
        System.out.println();    
    }

}
