import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for arr1
        System.out.println("Enter elements for arr1: ");
        ArrayList<String> arr1 = readArrayList(in);

        // Input for arr2
        System.out.println("Enter elements for arr2: ");
        ArrayList<String> arr2 = readArrayList(in);

        // Joining the ArrayLists
        ArrayList<String> joinedArr = new ArrayList<>(arr1);
        joinedArr.addAll(arr2);

        // Displaying the output
        System.out.println("array1: " + arr1);
        System.out.println("array2: " + arr2);
        System.out.println("Joined Array: " + joinedArr);

        in.close();
    }

    private static ArrayList<String> readArrayList(Scanner in) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner lineScanner = new Scanner(in.nextLine());
        while (lineScanner.hasNext()) {
            arrayList.add(lineScanner.next());
        }
        lineScanner.close();
        return arrayList;
    }
}
