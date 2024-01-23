public class PersonTest {

    public static void main(String[] args) {
        Person John = new Person("John", 20);
        Person Jane = new Person("Jane", 34);

        System.out.println(John + " and " + Jane);

        int totalNbPeople = Person.census();
        System.out.println("Population: " + totalNbPeople);

    }
}