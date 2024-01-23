public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person John = new Person("John", 20);
        Person Jane = new Person("Jane", 34);

        System.out.println(person1);
        System.out.println(John + "and" + Jane);
    }
}
