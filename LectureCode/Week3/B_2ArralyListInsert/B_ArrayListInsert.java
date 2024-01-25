/* ArrayList example 1
 * Slide 19
 * Insert elements in alphabetical order 
*/

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.*;

public class B_ArrayListInsert {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("ant");
        arr.add("bat");
        arr.add("cat");
        arr.add("frog");
        arr.add("eagle");

        System.out.println(arr.toString());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the next animal or any number to exit:");

        // First test: dog, fish, bear, chicken, tiger, zebra, turtle

        while (!sc.hasNextInt()) {
            String animal = sc.next();
            System.out.println("Add ->" + animal);

            for (int index = 0; index < arr.size(); index++) {
                if (arr.get(index).compareTo(animal) > 0) {

                    arr.add(index, animal);// insertion
                    break; // breaks the loop

                }

                else if (arr.get(arr.size() - 1).compareTo(animal) <= 0) {
                    arr.add(arr.size(), animal);
                    break;
                }

            }
            System.out.println(arr);
            System.out.println("Enter the next animal or any number to exit:");
            animal = sc.nextLine();

        }

        System.out.println("Final arrayList: " + arr.toString());
        sc.close();

    }

}