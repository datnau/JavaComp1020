import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter percentage: ");
            int percentage = in.nextInt();

            if (percentage > 90) {
                System.out.println("Your grade is: A");
            } else if (percentage >= 80 && percentage < 90) {
                System.out.println("Your grade is: B");
            } else if (percentage >= 70 && percentage < 80) {
                System.out.println("Your grade is: C");
            } else if (percentage >= 60 && percentage < 70) {
                System.out.println("Your grade is: D");
            } else if (percentage < 60) {
                System.out.println("Your grade is: F");
            }
        }
    }
}
