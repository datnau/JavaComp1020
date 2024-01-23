
public class PersonTest {

    public static void main(String[] args) {
        Person John = new Person();
        Person Jane = new Person();

        John.id = 1;
        John.name = "John Smith";
        John.age = 34;

        Jane.id = 2;
        Jane.name = "Jane Peters";
        Jane.age = 36;

        System.out.println("****Person John Details****");
        System.out.println("John Object address:" + John);
        System.out.println("Id:" + John.id);
        System.out.println("Name:" + John.name);
        System.out.println("Age:" + John.age);

        System.out.println("****Person Jane Details****");
        System.out.println("John Object address:" + Jane);
        System.out.println("Id:" + Jane.id);
        System.out.println("Name:" + Jane.name);
        System.out.println("Age:" + Jane.age);

        if (John.age > Jane.age)
            System.out.println(John.name + " is older!");
        else
            System.out.println(Jane.name + " is older!");
        John = Jane;
        System.out.println("John Object address:" + John);
        System.out.println("John Object address:" + Jane);
    }

}
