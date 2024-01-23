
public class D_CloneShallowPerson {

    public static void main(String[] args) {
        // shallow copy
        Person one, two;
        one = new Person("Fred", 20, 29);
        two = one;

        System.out.println(one);
        System.out.println(two);
        two.setName("Paul");
        System.out.println(one);
        System.out.println(two);

    }
}