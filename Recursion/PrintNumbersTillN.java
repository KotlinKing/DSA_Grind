// Code: Program to print numbers from 1 to n
// Name: Abhishek Dharmik 
// Last Modified on: 23/10/2022

public class PrintNumbersTillN {
    public static void main(String[] args) {
       int n = 4;
       print1toN(n); 
    }
   
    private static void print1toN(int n) {
        if(n == 0)
           return;
        print1toN(n-1);
        System.out.println(n + " ");
    }   
}
