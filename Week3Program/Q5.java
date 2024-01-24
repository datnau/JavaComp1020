public class Q5 {
    int a = 10, b = 20;

    Q5() {
        System.out.println("Default constructor called");
    }

    Q5(int a, int b) {
        System.out.println("Parameterized constructor called");
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Q5 obj = new Q5(1, 2);
        System.out.println("a= " + obj.a + " b= " + obj.b);
        Q5 objD = new Q5();
        System.out.println("a= " + objD.a + " b= " + objD.b);
    }
}