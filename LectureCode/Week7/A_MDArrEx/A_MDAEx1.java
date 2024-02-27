public class A_MDAEx1 {
    public static void main(String[] args) {
        int[][] x = { { 7, 3, 1 }, { 4, 2, 0 } };
        System.out.println("x: " + x);
        System.out.println("x[1]: " + x[1]);
        System.out.println("x[1][1]:" + x[1][1]);
        System.out.println("**********************************");
        for (int i = 0; i < x.length; i++)
            System.out.println("x" + "[" + i + "]" + " " + x[i]);
        System.out.println("**********************************");
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++)
                System.out.println("x" + "[" + i + "]" + "[" + j + "]" + ": " + x[i][j]);

    }
}