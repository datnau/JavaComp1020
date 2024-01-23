import java.util.Scanner;

public class I_TypeCasting {
    public static void main(String[] args) {
        double d = 111.23;
        System.out.println("Print the double value: " + d);
        int i = (int) d;
        System.out.println("Print the int value: " + i);

        Scanner keyword = new Scanner(System.in);
        System.out.println("Enter a number:");
        i = keyword.nextInt();

        String s = Integer.toString(i);
        System.out.println(s);
        keyword.close();
    }

}
