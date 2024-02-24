import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
        final int LIST_SIZE = 3;
        ArrayList<Object> myList = new ArrayList<Object>();
        for (int i = 1; i <= LIST_SIZE; i++) {
            myList.add(i);
        }

        ArrayList permutations = allPermutations(myList);
        System.out.println("The list of permutations is:");
        System.out.println(permutations);
    }

    public static ArrayList allPermutations(ArrayList list) {
        ArrayList solutions = new ArrayList();

        if (list.size() == 1) // easy case
        {
            solutions.add(list.clone());
        } // easy case
        else {
            // Pick which element of list to use next.
            for (int i = 0; i < list.size(); i++) {
                Object next = list.get(i);
                list.remove(i); // Remove it - temporarily
                ArrayList allSubPerms = allPermutations(list); // Find all permutations of the rest
                // Every small permutation in allSubPerms must have
                // "next" tacked on, and then be added to the solutions.
                System.out.println(allSubPerms);
                System.out.println(list);
                for (int p = 0; p < allSubPerms.size(); p++) // For each ArrayList (permutation) in the ArrayList
                                                             // allSubPerms
                {
                    ArrayList subPerm = (ArrayList) ((allSubPerms.get(p))); // Remember, we get it as an Object! Need to
                                                                            // downcast. Type mismatch: cannot convert
                                                                            // from Object to ArrayList
                    subPerm.add(0, next);
                    solutions.add(subPerm);
                } // for p end
                list.add(i, next);
            } // for i end
        } // else (recursive case)
        return solutions;
    }

}