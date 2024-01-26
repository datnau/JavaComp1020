import java.util.Random;

public class IfCondition {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(80) + 1;
        if (age >= 75) {
            System.out.println("Ok Boomer! ");
        } else if (age >= 18) {
            System.out.println("You are an adult!");

        } else if (age >= 13) {
            System.out.println("You are a teenager! ");
        } else {
            System.out.println("You are not an adult! ");
        }
    }
}
