import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter elements for arr1: ");
        ArrayList<String> arr1 = readArrayList(in);

        System.out.println("Enter elements for arr2: ");
        ArrayList<String> arr2 = readArrayList(in);

        ArrayList<String> joinedArr = new ArrayList<>(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            joinedArr.add(arr1[i]);
        }
        for (int i = 0; i < arr2.size(); i++) {
            joinedArr.add(arr2[i]);
        }

        System.out.println("array1: " + joinedArr);
        System.out.println("array2: " + arr2);
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