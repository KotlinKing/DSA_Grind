public class MissingNumberInArray {
    public static void main(String[] args) {
        
        System.out.println("Program to find missing number in an array");

        // Array show not have duplicates 
        // Array no need to be sorted 
        // Values should be in range
        
        int arr [] ={1,2,3,4,5,7};
        int n =  arr.length + 1; 
        int sum = (n * (n+1))/2; 
        for(int i =0 ; i <arr.length; i ++){
            sum = sum - arr[i];
        }
        
        System.out.println("Missing number in an array is: " + sum);
    }
    
}
