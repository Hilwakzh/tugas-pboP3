public class operatorBitwise {
  public static void main(String[] args) {
    int a = 25;
    int b = 10;

    System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
    System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

    System.out.println();

    // Bitwise AND
    int hasilAnd = a & b;
    System.out.println("a & b = " + hasilAnd + " (" + Integer.toBinaryString(hasilAnd) + ")");

    // Bitwise OR
    int hasilOr = a | b;
    System.out.println("a | b = " + hasilOr + " (" + Integer.toBinaryString(hasilOr) + ")");

    // Bitwise XOR
    int hasilXor = a ^ b;
    System.out.println("a ^ b = " + hasilXor + " (" + Integer.toBinaryString(hasilXor) + ")");

    // Bitwise NOT
    int hasilNot = ~a;
    System.out.println("~a = " + hasilNot + " (" + Integer.toBinaryString(hasilNot) + ")");

    // Left shift (<<)
    int hasilLeftShift = a << 2;
    System.out.println("a << 2 = " + hasilLeftShift + " (" + Integer.toBinaryString(hasilLeftShift) + ")");

    // Right shift (>>)
    int hasilRightShift = a >> 2;
    System.out.println("a >> 2 = " + hasilRightShift + " (" + Integer.toBinaryString(hasilRightShift) + ")");

    // Unsigned right shift (>>>)
    int hasilUnsignedRightShift = a >>> 2;
    System.out.println("a >>> 2 = " + hasilUnsignedRightShift + " (" + Integer.toBinaryString(hasilUnsignedRightShift) + ")");
  }
}
