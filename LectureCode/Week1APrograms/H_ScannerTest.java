import java.util.Scanner;

public class H_ScannerTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = keyboard.nextLine();
        System.out.print("Good morning " + name);

        System.out.print("Where do you live? ");
        String city = keyboard.next();
        System.out.println("I live in " + city);

        System.out.println("Provide the Area code?");
        int i = keyboard.nextInt();
        System.out.println("Youa area code is: " + i);

        keyboard.close();
    }
}
