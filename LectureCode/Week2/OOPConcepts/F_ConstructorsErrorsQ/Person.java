
public class Person {
    private int age;

    public String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Delete the setAge and getAge methods
    // Define different constructors.
    public String toString() {
        return name + "(" + age + ")";
    }

}
