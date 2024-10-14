
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
        int x = 10;
        int y = 12;
        if(x + y > 20) {
            System.out.println("(x + y) is greater than 20"); 
        }

        // --> (2) if-else statement
        // Basic Syntax
                // if(condition){
                //     statement 1; // executes when condition is true
                // }
                // else {
                //     statement 2; // executes when condition is false
                // }
        // Example
        int x1 = 10;
        int y1 = 12;
        if(x1 + y1 < 10) {
            System.out.println("(x1 + y1) is less than 10");
        }
        else {
            System.out.println("(x1 + y1) is greater than 20");
        }
    }
    
}
