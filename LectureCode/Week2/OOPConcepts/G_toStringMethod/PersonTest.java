public class PersonTest {

    public static void main(String[] args) {
        Person John = new Person();
        Person Jane = new Person();
        John.setAge(10);
        Jane.setAge(32);
        John.name = "John Smith";
        Jane.name = "Jane Peters";
        System.out.println("John age: " + John.getAge());
        System.out.println("Jane age: " + Jane.getAge());
        System.out.println(John);
        System.out.println(Jane);
        System.out.println(John + " and " + Jane);

    }
}
