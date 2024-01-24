public class PersonTest {
    public static void main(String[] args) {
        Person john = new Person("John Goe", 67, 24000);
        System.out.println(john);
        john.setName("John Doe");
        john.setAge(42);
        Person jane = new Person();
        jane.setName("Mary Jane");
        jane.setAge(55);
        jane.haveBirthday();
        john.setSalary(24000.5);
        System.out.println(john.getSalary());
        System.out.println(jane.getage());
        if (john.getage() > jane.getage())
            System.out.println(john.toString());
        else
            System.out.println(jane.toString());
        john.setSameAge(jane);
        System.out.println(john.toString());

    }
}
