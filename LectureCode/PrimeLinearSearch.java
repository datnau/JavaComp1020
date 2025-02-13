import java.util.ArrayList;
import java.util.Arrays;

public class PrimeLinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 7, 8, 9));
        System.out.println("First prime: " + findFirstPrime(list1));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 15, 20, 25));
        System.out.println("First prime: " + findFirstPrime(list2));
    }

    public static int findFirstPrime(ArrayList<Integer> data) {
        for (int index = 0; index < data.size(); index++) {
            int num = data.get(index);

            // Check if the number is prime
            if (num > 1) {
                boolean isPrime = true;

                if (num == 2) {
                    return num; // 2 is a prime number
                }
                if (num % 2 == 0) {
                    isPrime = false; // Even numbers >2 are not prime
                } else {
                    for (int i = 3; i * i <= num; i += 2) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    return num; // Return the first prime number found
                }
            }
        }
        return -1; // No prime number found
    }
}
