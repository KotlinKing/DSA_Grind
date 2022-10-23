// Code: Program to print numbers from n to 1
// Name: Abhishek Dharmik 
// Last Modified on: 23/10/2022

public class PrintNumbers {
    public static void main(String[] args) {
       int n = 4;
       printNto1(n); 
    }
   
    private static void printNto1(int n) {
        if(n == 0)
           return;
        System.out.println(n + " ");
        printNto1(n-1);
    }   
}
