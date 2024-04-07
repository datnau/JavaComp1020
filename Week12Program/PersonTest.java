// PersonPhone.java
public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        Phone[] phones1 = {
                new Phone("Iphone 1", "001", 2023, 799.99),
                new Phone("Samsung 2", "002", 2024, 999.99)
        };

        Phone[] phones2 = {
                new Phone("Iphone 5", "003", 2022, 699.99),
                new Phone("Samsung 5", "004", 2023, 899.99)
        };

        person1.addPerson("THANH", 19, phones1);
        person2.addPerson("DAT", 29, phones2);

        System.out.println("Person 1 Details:\n" + person1);
        System.out.println("Person 2 Details:\n" + person2);

        System.out.println("Person 1 First Phone Details:\n" + person1.toString().split("\n")[1]);
        System.out.println("Person 2 First Phone Details:\n" + person2.toString().split("\n")[1]);
    }
}
