import java.util.Arrays;

public class I_ArrayOfObjects {
    public static void main(String[] args) {

        // an array objects
        Person[] people = { new Person("Jenn", 22, 165),
                new Person("Susan", 19, 170) };
        System.out.println("***Printing people***");
        System.out.println(Arrays.toString(people));

        // shallow copy
        Person[] others = people;
        System.out.println("****Printing others***");
        System.out.println(Arrays.toString(others));

        // get a new Person array.
        Person[] others1 = new Person[people.length];
        System.arraycopy(people, 0, others1, 0, people.length);
        System.out.println("***Printing others1***");
        System.out.println(Arrays.toString(others1));
        // deepcopy
        Person[] others2 = new Person[people.length];

        for (int i = 0; i < people.length; i++)
            others2[i] = people[i].clone();
        System.out.println("***Printing others2***");
        System.out.println(Arrays.toString(others2));

        System.out.println("***Printing people again***");
        System.out.println(Arrays.toString(people));
        System.out.println("***Printing others again***");
        System.out.println(Arrays.toString(others));
        System.out.println("***Printing others1 again***");
        System.out.println(Arrays.toString(others1));

    }

}