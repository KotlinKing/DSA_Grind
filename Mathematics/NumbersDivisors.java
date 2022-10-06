// Code: Program to find divisors of a number in sorted order
// Name: Abhishek Dharmik
// Last Modified on: 06/10/2022

// Explanation: we are given a number A and we 
// need to find out all the numbers which divides A.
// Example: A = 7 ; Divisors = 1, 7;
// A = 100 ; Divisors = 1, 2, 4, 5, 10, 20, 25, 50, 100

public class NumbersDivisors {
    
    public static void main(String[] args) {
        System.out.print("Divisors: " );
        printDivisors(100);
    }

    public static void printDivisors(int n) {
        // Naive Approach
        // for (int i =1; i <= n; i++) {
        //     if(n%i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        //Efficient Approach
        int i; 
        for(i=1; i*i <= n; i++) {
        // Prints all divisors from 1 to √n
           if (n%i == 0) {
                System.out.print(i+ " ");
            }
        }
 
        //Print all divisors from √n to n
        for ( ; i >= 1; i--) {
            if (n%i == 0) {
                System.out.print(n/i + " ");
            }
        }
    }
}
