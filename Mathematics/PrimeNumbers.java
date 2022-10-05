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
