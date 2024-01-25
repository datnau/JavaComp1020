/*ArrayList example 2
 * Slide 20
 * Example 2: Remove duplicates from a list of words
 * 
 */

import java.util.ArrayList;

public class C_ArrayListRemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("three");
        list.add("two");
        System.out.println(list);
        System.out.println(list.size());
        // method 1
        for (int index = 0; index < list.size(); index++) {
            for (int j = list.size() - 1; j >= 0; j--) {
                if (list.get(j).equals(list.get(index)) && j != index) {
                    System.out.println("Remove ->" + list.get(j));
                    list.remove(j);
                    System.out.println(list);
                }
            }
        }

        // ------------------------------------------------------------------
        // method 2

        // for (int i = list.size() - 1; i >= 0; i--) {
        // String word = list.get(i);
        // int lastIndex = list.lastIndexOf(word);

        // if (lastIndex != i) {
        // System.out.println("Remove : " + list.get(lastIndex));
        // list.remove(lastIndex);
        // System.out.println("List:" + list);

        // }

        // }
        // System.out.println("Final List:" + list);

        /// ------------------------------------------------------------------
        // for (int i = 1; i < list.size(); i++) {
        // if (list.get(list.size() - i).equals(list.get(index)) && (list.size() - i !=
        // index)) {
        // System.out.println("Remove ->" + list.get(list.size() - i));
        // list.remove(list.size() - i);
        // System.out.println(list);

    }
}