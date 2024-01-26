import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for arr1
        System.out.println("Enter elements for arr1: ");
        ArrayList<String> arr1 = ArrayList < String > (in);

        // Input for arr2
        System.out.println("Enter elements for arr2: ");
        ArrayList<String> arr2 = ArrayList(in);

        // Joining the ArrayLists
        ArrayList<String> joinedArr = new ArrayList<String>(arr1);
        joinedArr.add(arr2);

        // Displaying the output
        System.out.println("array1: " + joinedArr);

        // Creating arr2Output separately for clarity
        ArrayList<String> arr2Output = new ArrayList<String>(arr2);
        System.out.println("array2: " + arr2Output);

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
