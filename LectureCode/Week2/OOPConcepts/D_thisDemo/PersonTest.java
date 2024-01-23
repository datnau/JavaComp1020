public class PersonTest {
    public static void main(String[] args) {
        Person John = new Person();
        System.out.println("The object address is: " + John);
        John.setAge(10);
        System.out.println("The age of John is:" + John.getAge());
        John.haveBirthday();
        John.name = "John Smith";
        John.nameLength();
        System.out.println("**************************************");

        Person Jane = new Person();
        System.out.println("The object address is: " + Jane.toString());
        Jane.setAge(22);
        System.out.println("The age of Jane is:" + Jane.getAge());
        Jane.haveBirthday();
        Jane.name = "Jane Williams";
        Jane.nameLength();

    }

}
