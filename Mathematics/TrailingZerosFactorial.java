// Code: Program to find trailing zeros in factorial of a number
// Name: Abhishek Dharmik
// Last Modified on: 03/10/2022

// Example: 
// n = 5  ; 1*2*3*4*5  = 120; trailing zeros = 1
// n = 10 ; 1*2*3..*10 = 3628800; trailing zeros = 2

public class TrailingZerosFactorial {
    public static void main(String[] args) {
        int number = countZeros(10);        
        System.out.println("Trailing zeros: " + number);
    }

    public static int countZeros(int n) {
        // counting 2 and 5 as pairs in
        // prime factorization of a number 
        // Note: Number of 5's will be
        //       less than number of 2's.  
        int res = 0;
        for(int i = 5; i<=n;i = i*5) {
            res = res + n/i;
        }
        return res;
    }
}
