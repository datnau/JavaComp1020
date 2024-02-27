import java.util.ArrayList;

/**
 * Demonstrate recursive conversion to binary
 * A binary number is a number expressed in the base-2 numeral system
 * Examples
 * 0 + 2 =2
 * 1 1
 * 1 + 2 + 4 + 8 + 16+ 32 + 64 +128 = 255
 * 1 1 1 1 1 1 1 1
 */
public class D_BinaryConversion {
	public static void main(String[] args) {
		System.out.println("1 in binary is " + binary(1));
		System.out.println("2 in binary is " + binary(2));
		System.out.println("3 in binary is " + binary(3));
		System.out.println("4 in binary is " + binary(4));
		System.out.println("5 in binary is " + binary(5));
		System.out.println("10 in binary is " + binary(10));
		System.out.println("255 in binary is " + binary(255));
	}

	public static ArrayList<Integer> binary(int n) {
		// the base case
		if (n == 0)
			return new ArrayList<Integer>();
		else {
			ArrayList<Integer> bin = binary(n / 2);
			bin.add(n % 2);
			return bin;
		}
	}
}
