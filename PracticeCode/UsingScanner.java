import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("How old are you? ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("What is your favourite food? ");
        String food = in.nextLine();

        System.out.println("Hello" + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        in.close();
    }
}
