public class PersonTest {
    public static void main(String[] args) {
        Person John = new Person();
        // John.age = 10;
        John.name = "John Smith";

        John.setAge(10);
        System.out.println("The age of John is:" + John.getAge());
        John.haveBirthday();
        John.nameLength();

        /*
         * Person Jane = new Person();
         * Jane.age = 22;
         * Jane.haveBirt-hday();
         * Jane.name = "Jane Williams";
         * Jane.nameLength();
         */

    }

}
