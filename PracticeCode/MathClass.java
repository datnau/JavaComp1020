
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);
        scanner.close();
        /* Math.round() -> làm tròn giá trị số thực
         * Math.ceil() -> làm tròn xuống
         * Math.floor() -> làm tròn lên
        */
    }
}
