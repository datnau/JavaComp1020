import java.util.Scanner;

public class TheAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();
        float num4 = in.nextFloat();
        float result = average(num1, num2, num3, num4);
        System.out.println("The average is: " + result);
    }

    static float average(float x1, float x2, float x3, float x4) {
        return (x1 + x2 + x3 + x4) / 4;
    }

}
