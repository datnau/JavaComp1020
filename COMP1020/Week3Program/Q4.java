public class Q4 {
    public static void main(String[] args) {
        int val = 3;
        func(val);
        System.out.println("Value from main(): " + val);
    }

    public static int func(int a) {
        a += 6;
        System.out.println("Value from func(): " + a);
        return a;
    }
}
