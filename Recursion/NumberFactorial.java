// Code: Program to print factorial of a number
// Name: Abhishek Dharmik 
// Last Modified on: 24/10/2022

public class NumberFactorial {
    public static void main(String[] args) {
        int n = 4, k = 1;
        System.out.println(fact(n,k));
    }

    private static int fact(int n, int k) {
        if( n ==0 || n ==1)
            return k;
        return fact(n-1,k*n);
    }
}
