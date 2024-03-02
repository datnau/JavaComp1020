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

        // Remove odd numbers
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i--;
            }
        }

        // Find min and max values
        int minValue = numbers.get(0);
        int maxValue = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current < minValue) {
                minValue = current;
            }
            if (current > maxValue) {
                maxValue = current;
            }
        }

        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}