
// --> Java keywords are also known as reserved words. Kewords are key to a code.
// --> Keywords cannot be used as variable/object name/class name.


// --> Java Control Statements 
public class control_statements {

    public static void main(String[] args) {
        
        // --> (1) Simple if statement
        // Basic Syntax
                    // if(condition){
                    //     statement 1; // executes when condition is true
                    // }
        // Example             
        // int x = 10;
        // int y = 12;
        // if(x + y > 20) {
        //     System.out.println("(x + y) is greater than 20"); 
        // }

        // --> (2) if-else statement
        // Basic Syntax
                // if(condition){
                //     statement 1; // executes when condition is true
                // }
                // else {
                //     statement 2; // executes when condition is false
                // }
        // Example
        // int x1 = 10;
        // int y1 = 12;
        // if(x1 + y1 < 10) {
        //     System.out.println("(x1 + y1) is less than 10");
        // }
        // else {
        //     System.out.println("(x1 + y1) is greater than 20");
        // }

        // (3) if-else-if ladder
        // Basic Syntax
                // if(condition 1){
                //     statement 1; // executes when condition 1 is true
                // }
                // else if(condition 2){
                //     statement 2; // executes when condition 2 is true
                // }
                // else{
                //     statement 3; // executes when all the condition are false
                // }
        // Example
        // String city = "Delhi";
        // if (city == "Meerut") {
        //     System.out.println("City is Meerut");
        // }
        // else if(city == "Noida") {
        //     System.out.println("City is Noida");
        // }
        // else{
        //     System.out.println(city);
        // }
        
        // (4) Nested if-statement
        // Basic Syntax
                // if(condition 1) {
                //     statement 1; // executes when condition 1 is true
                // if (condition 2) {
                //     statement 2; // executes when condition 2 is true
                // }
                // else{
                //     statement 2; // executes when conditon 2 is false
                // }
            // }
        // Example
        // String address = "Delhi,India";
        // if (address.endsWith("India")) {
        //     if (address.contains("Meerut")) {
        //         System.out.println("Your City is Meerut");
        //     }
        //     else if (address.contains("Noida")) {
        //         System.out.println("Your City is Noida");
        //     }
        //     else {
        //         System.out.println(address.split(",")[0]);
        //     }
        // }
        // else {
        //     System.out.println("You are not living in India");
        // } 
        
        // (5) Switch Statement
        // Basic Syntax
        // switch(expression) {
        //     case value1:
        //     statement 1;
        //     break;
        //     ....
        //     case value N:
        //     statement N;
        //     break;
        //     default:
        //     default statement;
        // }

        // Example 
        // int num = 0;
        // switch (num) {
        //     case 0:
        //     System.out.println("number is 0");
        //     break;
        //     case 1:
        //     System.out.println("number is 1");
        //     break;
        //     default:
        //     System.out.println(num);
        // }

        // (6) Loop Statements

        // (i) Java for loop
        // Basic Syntax
        // for(initialisation; condition; increment/decrement) {
        //     // block of statements
        // }
        // Example
        int sum = 0;
        for(int j = 1; j <= 10; j++){
            sum += j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

        // (ii) Java for-each loop
        // Basic Syntax
        // for(data_type var: array_name/collection_name) {
        //     // statements
        // }
        String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
        System.out.println("Printing the content of array names:\n");
        
        for(String name:names) {
            System.out.println(name);
        }

        // (iii) Java while loop
        
    }
    
}
