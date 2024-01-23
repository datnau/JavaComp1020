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
        for (int index = 0; index < list.size(); index++) {
            for (int i = 1; i < list.size(); i++) {

                if (list.get(list.size() - i).equals(list.get(index)) && (list.size() - i != index)) {
                    System.out.println("Remove ->" + list.get(list.size() - i));
                    list.remove(list.size() - i);
                    System.out.println(list);

                }
            }
        }
    }
}