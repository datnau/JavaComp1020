import java.util.ArrayList;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> findAllPrimes(ArrayList<Integer> arrayList) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : arrayList) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4); // Not prime
        numbers.add(7); // Prime
        numbers.add(10); // Not prime
        numbers.add(11); // Prime

        ArrayList<Integer> primeNumbers = findAllPrimes(numbers);
        if (primeNumbers.size() > 0) {
            System.out.println("Prime numbers found: " + primeNumbers);
        } else {
            System.out.println("No prime numbers found.");
        }
    }
}
