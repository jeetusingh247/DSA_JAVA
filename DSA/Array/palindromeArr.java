public class palindromeArr {
    
    // --> Algo to check isPalindrome
    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    public static void main(String[] args) {
        palindromeArr str = new palindromeArr();  // insatnce
        if (str.isPalindrome("that")) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
