import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter str2: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter str3: ");
        String str3 = scanner.nextLine();

        displayInAscendingOrder(str1, str2, str3);

        scanner.close();
    }

    private static void displayInAscendingOrder(String str1, String str2, String str3) {

        if (str1.compareTo(str2) > 0) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (str2.compareTo(str3) > 0) {
            String temp = str2;
            str2 = str3;
            str3 = temp;
        }

        if (str1.compareTo(str2) > 0) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        System.out.println("Output: " + str1 + ", " + str2 + ", " + str3);
    }
}
