
public class O_ArrayLengthEx {
    public static void main(String[] args) {
        int[] arr = new int[] { 21, 22, 23, 24, 25, 26 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        System.out.println("Sum:" + sum);
    }
}
