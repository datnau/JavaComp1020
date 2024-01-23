public class PersonTest {

    public static void main(String[] args) {
        Person John = new Person();
        Person Jane = new Person("Jane", 34);
        // Complete the line 7
        Person Jay = new Person(23);

        // use Paramererized constructor with one argument to instantiate Jay object
        // delete setAge and getAge methods

        Jay.setAge(10);

        System.out.println("Jay age: " + Jay.getAge());

        System.out.println(John + " , " + Jane + " and " + Jay);
    }
}