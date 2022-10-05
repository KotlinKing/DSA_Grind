// Code: Program to find LCM of two numbers
// LCM ( Least Common Multiple )
// Name: Abhishek Dharmik
// Last Modified on: 05/10/2022

// Explanation: we are given two numbers A & B and we 
// need to find out the least number which is divisible by 
// both A & B. 
// Example: a = 12 & b = 15 ; LCM = 60
// a = 4 & b = 6 ; LCM = 12

public class NumbersLCM {
    public static void main(String[] args) {
        int a = lcm(4,6);
        System.out.println("LCM of two numbers is: " + a);
    }

    // public static int lcm (int a, int b){
    //     Naive Solution
    //      int res = Math.max(a, b);
    //      while(true) {
    //         if(res%a==0 && res%b ==0) {
    //             return res; 
    //         }
    //         res++;
    //      } 

    //     Efficient Solution 
    //     a*b = gcd(a,b) * lcm (a,b)        
    // }

    // Calculating  GCD
    public static int gcd (int a,int b) {
        if( b== 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    // Calculating LCM 
    public static int lcm (int a, int b) {
        return (a*b)/gcd(a,b);
    }
}
