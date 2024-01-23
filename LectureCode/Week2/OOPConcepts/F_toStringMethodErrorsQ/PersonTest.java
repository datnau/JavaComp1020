public class PersonTest {

    public static void main(String[] args) {
        Person John = new Person("John", 20);
        Person Jane = new Person("Jane", 34);
        Person Jay=new Person(10);
        Jay.name="Jay Abc";
        //Jay.setAge(10);

        System.out.println("Jay age: " + John.getAge());

        System.out.println(John + " , " + Jane + " and " + Jay);
    }
}