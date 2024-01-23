
public class Person {
    private int age;
    private String name;

    public Person() {
        name = "NewBorn";
        age = 0;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String toString() {
        return name + "(" + age + ")";
    }

}