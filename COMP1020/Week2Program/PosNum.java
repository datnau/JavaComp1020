import java.util.Scanner;

public class PosNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 numbers
        int[] arrNum = new int[10];

        // Accept 10 numbers from the user
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arrNum[i] = scanner.nextInt();
        }

        // Analyze the numbers
        int positiveCount = 0;
        int negativeCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int number : arrNum) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the results
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scanner.close();
    }
}
