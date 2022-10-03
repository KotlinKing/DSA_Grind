// Code: Program to find factorial of a number
// Name: Abhishek Dharmik
// Last Modified on: 03/10/2022

class NumberFactorial {
    public static void main(String[] args) {
        int number = fact(3);    
        System.out.println(number);
    }

    public static int fact(int n){
        // "Recursive solution" 
        // if(n==0)
        //     return 1;

        // return n*fact(n-1);

        // "Iterative solution"
        int res = 1; 
        for (int i=2; i<=n;i++){
            res = res * i;
        }
        return res;
    }
}