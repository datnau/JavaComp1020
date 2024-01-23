public class G_Formatting {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        double c = 45.766333445465657;
        // System.out.printf("%d add it with %d and the result will be %d", a, b,(a+b));
        System.out.println(a + " add it with " + b + " and the result will be " + (a + b));
        System.out.printf("%d add it with %d and the result will be %d %n", a, b, (a + b));
        System.out.printf("Float value output: %2.3f %n", c);

    }
}
