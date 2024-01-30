import java.util.ArrayList;

public class FindOddNums {
    public static void main(String[] args) {
        // Create an ArrayList and insert numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(65);
        numbers.add(12);
        numbers.add(24);
        numbers.add(27);
        numbers.add(120);
        numbers.add(73);
        numbers.add(90);
        numbers.add(142);

        // a) Remove odd numbers from the list
        removeOddNumbers(numbers);

        // b) Find the maximum and minimum element
        int maxElement = findMaxElement(numbers);
        int minElement = findMinElement(numbers);

        // Display results
        System.out.println("ArrayList after removing odd numbers: " + numbers);
        System.out.println("Maximum element: " + maxElement);
        System.out.println("Minimum element: " + minElement);
    }

    private static void removeOddNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--; // Adjust index after removal
            }
        }
    }

    private static int findMaxElement(ArrayList<Integer> numbers) {
        int maxElement = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        return maxElement;
    }

    private static int findMinElement(ArrayList<Integer> numbers) {
        int minElement = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < minElement) {
                minElement = num;
            }
        }
        return minElement;
    }
}
