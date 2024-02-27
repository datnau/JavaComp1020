public class B_FacrotialIterative {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial Iterative version:" + factIt(n));

    }

    public static long factIt(int n) {
        long nfact = 1;
        if (n == 1 || n == 0)
            return nfact;
        else {
            for (int i = n; i > 0; i--) {
                nfact *= i;

            }
        }
        return nfact;
    }
}