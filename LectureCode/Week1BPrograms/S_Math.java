// java.lang.Math class contains various methods to perform basic numeric operations 

public class S_Math {
    public static void main(String[] args) {
        int r = 4;
        int area = (int) (Math.PI * r * r);
        System.out.printf("Area of the cirlce is:%d %n", area);
        System.out.printf("Square value of R is %f %n", (Math.pow(r, 2)));
        System.out.printf("Square root value of R is %f %n", (Math.sqrt(r)));
    }

}