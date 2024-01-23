public class E_GlobalLocal {
    final static int i = 5; // global variable

    public static void main(String[] args) {
        int i = 6; // local variable
        System.out.println("Local variable:" + i);
        System.out.println("Global variable:" + FromFunction());

    }

    static int FromFunction() {
        return i;
    }

}
