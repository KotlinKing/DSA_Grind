// Code: Program to calculate power of a number
// Name: Abhishek Dharmik
// Last Modified on: 08/10/2022

//Example: 3^4 ; 3*3*3*3 = 81

class NumberPower {
    public static void main(String[] args) {
        int number = power(3, 4);
        System.out.println(number);
    }

    public static int power(int x, int n) {
        // Naive Solution
        // int res = 1; 
        // for(int i = 0; i < n; i++) { 
        //     res = res * x;
        // }

        // Calculating Power Recursively

        // Base Condition
        if (n == 0)
             return 1;
            
        int res = power(x, n / 2);

        // For odd power 
        if ((n & 1) == 1)
            return x * res * res;

        // For Even power
        return res * res;
    }


}