// Code: Program to find a prime number
// Name: Abhishek Dharmik
// Last Modified on: 05/10/2022

// Explanation: we are given a number A and we 
// need to find out the whether it is 
// only divisible by 1 and itself.

// Example: a = 13 ; Number is a prime number? true 
// a = 12 ; Number is a prime number? false

public class PrimeNumbers {

    public static void main(String[] args) {
        boolean bool =  isPrime(3);
        System.out.println("Number is a prime number? " + bool);
    }

    public static boolean isPrime (int a) {
        // Naive Method 
        // if (a == 1) {
        //     return false;
        // }
        // for (int i = 2; i<a; i++) {
        //     if(a%i ==0) {
        //         return false;
        //     }
        // }
        // return true;

        // Efficient Method 
        if (a == 1) {
            return false;
        }
        for (int i = 2; i*i<a; i++) {
            if(a%i ==0) {
                return false;
            }
        }
        return true;
    }
}
