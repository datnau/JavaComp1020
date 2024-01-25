//copy objects: 3 ways: shallow copy, deep copy and clone

public class CloneObjectsExample {

    public static void main(String[] args) {
        Person one, two;
        one = new Person("Fred", 20, 29);
        // // shallow copy

        // two = one;

        // System.out.println(one);
        // System.out.println(two);
        // two.setName("Paul");
        // System.out.println(one);
        // System.out.println(two);

        // clone
        Person three = one.clone();
        three.setName("John");
        System.out.println(one);
        System.out.println(three);

        // // shallow copy arrays
        // int[] a1 = { 4, 1, 7 };
        // int[] a2;
        // a2 = a1;
        // for (int ele : a1)
        // System.out.print(ele + "\t");
        // System.out.println();
        // for (int ele : a2)
        // System.out.print(ele + "\t");
        // System.out.println();
        // System.out.println("After the a[0] changed value");
        // a2[0] = 5;
        // for (int ele : a1)
        // System.out.print(ele + "\t");
        // System.out.println();
        // for (int ele : a2)
        // System.out.print(ele + "\t");

        // //deep copy arrays
        // a2 = new int[a1.length];
        // for(int i=0; i<a1.length; i++)
        // a2[i] = a1[i];

        // //clone arrays
        // /*arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos,
        // int len)
        // Parameters :
        // source_arr : array to be copied from
        // sourcePos : starting position in source array from where to copy
        // dest_arr : array to be copied in
        // destPos : starting position in destination array, where to copy in
        // len : total no. of components to be copied.
        // */
        // a2 = new int[a1.length];
        // //copy the array, but the objects are pointing to the same reference
        // System.arraycopy(a1, 0, a2, 0, a1.length);

        // //*****Copying array of objects*****/

        // //create an array objects
        // Person[] people = {new Person("Jenn", 22, 165),
        // new Person("Susan", 19, 170)};

        // //shallow copy-> only copy the references
        // Person[] others = people;

        // //get a new Person array. Copy the array, but the objects are pointing to the
        // same reference
        // Person[] others1 = new Person[people.length];
        // System.arraycopy(people, 0, others, 0, people.length);

        // //most of the time, we want a deep copy. So, we need a loop to clone the
        // objects
        // Person[] others2 = new Person[people.length];
        // for(int i=0; i<people.length; i++)
        // others[i] = people[i].clone();

    }

}
