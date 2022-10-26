// Code: Program to check palindrome string
// Name: Abhishek Dharmik 
// Last Modified on: 26/10/2022

public class Palindrome {
    public static void main(String[] args) {
        String str = "asdrrdsa";
        System.out.println("String is Palindrome: " + isPalindrome(str, 0,str.length()-1));
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if(start >= end)
            return true; 
        return(str.charAt(start) == str.charAt(end) &&
                isPalindrome(str, start+1, end-1));
    }
}
