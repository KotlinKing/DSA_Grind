// Code: Program to check if K-th bit is set
// Name: Abhishek Dharmik
// Last Modified on: 15/10/2022

// Example: n = 5, k = 3 
// Output: YES

// Explanation: Binary Representation of 5: 000101
// k-th bit in this case is 1 which is set 
// Therefore the output is YES. 

public class CheckKBitSet {
    public static void main(String[] args) {
        kthBit(5,2);
    }

    public static void kthBit(int n, int k) {
        // we are simply right shifting the k-th bit
        // to first position and doing bitwise AND with 1 

        if(((n>>(k-1)) & 1) ==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}