// Code: Program to Count Number of Digits
// Name: Abhishek Dharmik 
// Last Modified on: 03/10/2022

public class CountDigits {
    public static void main(String[] args) {
        int count = countDigits(2);
        System.out.println(count);
    }

    public static int countDigits(int number){
        int result = 0;
        
        while(number > 0 ){
            number = number/10;
            result++;
        }
        return result; 
    }
}
    
