public class D_Methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int sum = SumOfTwoNumbers(a, b);
        PrintMessage();
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

    }

    static int SumOfTwoNumbers(int a, int b) {
        return (a + b);
    }

    static void PrintMessage() {
        System.out.println("***Hello Class***");
    }

}
