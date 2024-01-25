import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListJoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for arr1
        System.out.println("Enter elements for arr1: ");
        String[] arr1Input = in.nextLine().split(" ");
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr1Input));

        // Input for arr2
        System.out.println("Enter elements for arr2: ");
        String[] arr2Input = in.nextLine().split(" ");
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(arr2Input));

        // Joining the ArrayLists
        ArrayList<String> joinedArr = new ArrayList<>(arr1);
        joinedArr.addAll(arr2);

        // Displaying the output
        System.out.println("array1: " + joinedArr);

        // Creating array2 separately for clarity
        ArrayList<String> arr2Output = new ArrayList<>(arr2);
        System.out.println("array2: " + arr2Output);
    }
}
