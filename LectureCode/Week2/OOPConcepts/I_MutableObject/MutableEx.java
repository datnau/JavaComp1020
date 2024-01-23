
import java.util.Arrays;

public class MutableEx {

    public static void main(String[] args) {
        int myInt = 0; // myInt is not a reference
        int[] myArray; // myArray is a reference
        myArray = new int[] { 0, 1, 2 }; // the array is the object
        System.out.println("**********Before function call**********");
        System.out.println(myInt);
        System.out.println(Arrays.toString(myArray));

        f(myInt, myArray);

        System.out.println("**********After function call**********");

        // System.out.println(myInt);
        System.out.println(Arrays.toString(myArray));
        // myInt = fint(myInt);
        System.out.println(myInt);

    }

    static void f(int i, int[] arr) {
        i = -1;
        arr[0] = -1;

    }

    /*
     * static int fint(int i) {
     * i = -1;
     * return i;
     * 
     * }
     */

}
