public class E_ExceptionHandling0 {

    public static void main(String[] args) {

        ArithmeticException ae = new ArithmeticException("I blew it!");

        System.out.println("Caught an exception: ");
        System.out.println("getMessage(): " + ae.getMessage());
        System.out.println("toString(): " + ae.toString());
        System.out.println("printStackTrace(): ");
        ae.printStackTrace();
    }

}
