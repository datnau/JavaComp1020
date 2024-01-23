public class E_CloneDeepPerson {
    // clone
    public static void main(String[] args) {

        Person one, two;
        one = new Person("Fred", 20, 29);
        two = one;
        Person three = one.clone();
        three.setName("John");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }

}
