public class F_ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] NumList = { 1, 2, 3, 4 };
            System.out.println(NumList[1]);
            System.out.println("Hello World");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong. Check the index value.");

        }
    }
}
