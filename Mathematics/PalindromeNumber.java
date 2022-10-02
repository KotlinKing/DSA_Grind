// Code: Program to find a Palindrome Number
// Name: Abhishek Dharmik
// Last Modified on: 03/10/2022

//Example of Palindrome Numbers: 
// 1221, 123454321, 12321, 1

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean bool = isPalindrome(1234321); 
        if(bool){
            System.out.println("Given number is a palindrome number.");
        }else{
            System.out.println("Given number is not a palindrome number");
        }
    }

    private static boolean isPalindrome(int number) {
        int rev = 0; 
        int temp = number;
        while(temp!=0){
            int lastDigit = temp % 10; 
            rev = rev * 10 + lastDigit;
            temp = temp/10;
        }
        return (rev == number);
    }
}
