// Code: Program to find HCF of two numbers
// HCF ( Highest Common Divisor )
// Name: Abhishek Dharmik
// Last Modified on: 04/10/2022

// Explanation: we are given two numbers A & B and we 
// need to find out the largest number which divides 
// both A & B. 
// Example: a = 100 & b = 200 ; HCF = 100
// a = 4 & b = 6 ; HCF = 2

class NumberHCF {
    public static void main(String[] args) {
        int a = gcd(100,200);
        System.out.println("HCF of given numbers is: " + a);
    }


    public static int gcd (int a, int b){
        // Naive Solution
        // int res = Math.min(a,b);
        // while(res>0){
        //     if (a%res == 0 && b%res == 0)
        //         {
        //             break;
        //         }
        //     res -- ;
        // }
        // return res;

        // Efficient Approach (Euclidean Algorithm)
        // Let 'b' be smaller than 'a'
        // gcd(a,b) = gcd(a-b,b)

        while(a != b) {
            if ( a > b) {
                a = a - b; 
            } else {
                b = b - a;
            }
        }
        return a; 
    }    
}