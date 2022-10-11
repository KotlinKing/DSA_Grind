package Bit_Magic;

public class BitwiseAndOrXOR {
    public static void main(String[] args) {
        // Bitwise And
        // x: 0...0011
        // y: 0...0110
    // (x&y): 0...0010 = Binary representation value is 2
        int x = 3; int y = 6;
        System.out.println(x&y);

        // Bitwise Or
        // x: 0...0011
        // y: 0...0110
    // (x|y): 0...0111 = Binary representation value is 7
        System.out.println(x|y);

        // Bitwise XOR
        // x: 0...0011
        // y: 0...0110
    // (x^y): 0...0101 = Binary representation value is 5
        System.out.println(x^y);
    }
}
