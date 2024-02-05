import java.util.Random;

public class AdventureGame {

    private static int score = 0;

    public static final int SEED = 301524;

    public static void main(String[] args) {
        processSeed(SEED);
        displayResult();
    }

    private static void processSeed(int seed) {
        String seedString = Integer.toString(seed);

        for (int i = 0; i < seedString.length(); i++) {
            int digit = Character.getNumericValue(seedString.charAt(i));
            processDigit(digit, i > 0 && (i % 2 == 1), seedString.length() - i);
        }
    }

    private static void processDigit(int digit, boolean previousDigitOdd, int remainingDigits) {
        if (digit == 0) {
            // Do nothing
        } else if (digit >= 1 && digit <= 4) {
            if (digit == 1) {
                method1();
            } else if (digit == 2) {
                score += method2(remainingDigits);
            } else if (digit == 3) {
                score += method3(previousDigitOdd);
            } else if (digit == 4) {
                score += method4(generateRandomNumber(), generateRandomNumber());
            }
        } else if (digit >= 5) {
            System.out.println("Unknown location " + digit);
        }
    }

    private static void method1() {
        System.out.println("You are standing at the end of a road before a small brick building.");
    }

    private static int method2(int n) {
        System.out.println("You are in a maze of " + n + " twisty little passages, all alike.");
        return -n / 2;
    }

    private static int method3(boolean isBreathTakingView) {
        if (isBreathTakingView) {
            System.out.println("You are on the edge of a breath-taking view.");
            return 3;
        } else {
            System.out.println("It is pitch black. You are likely to be eaten by a grue.");
            return -3;
        }
    }

    private static int method4(int width, int depth) {
        System.out.println(
                "You are in a north/south canyon about " + width + " feet across and " + depth + " feet deep.");
        return width * depth / 100;
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(41) + 10; // Generates a random number between 10 and 50
    }

    private static void displayResult() {
        System.out.println("Final Score: " + score);

        if (score > 0) {
            System.out.println("Congratulations! You win!");
        } else if (score < 0) {
            System.out.println("Oops! You lose!");
        } else {
            System.out.println("It's a tie! You neither win nor lose.");
        }
    }
}
