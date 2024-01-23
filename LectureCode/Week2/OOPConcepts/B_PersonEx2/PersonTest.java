public class PersonTest {
    public static void main(String[] args) {
        Person John = new Person();
        John.age = 10;
        John.haveBirthday();
        John.name = "John Smith";
        int n = John.nameLength();
        System.out.println("The number of characters in " + John.name + " are:" + n);
        /*
         * Person Jane = new Person();
         * Jane.age = 22;
         * Jane.haveBirthday();
         * Jane.name = "Jane Williams";
         * Jane.nameLength();
         */

    }

}
