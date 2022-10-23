// Code: Program to calculate sum of n natural numbers using recursion
// Name: Abhishek Dharmik 
// Last Modified on: 24/10/2022

public class NumbrsSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n==0)
            return 0;
        return n + sum(n-1);
    }   
}
