
public class Person {
    private int age;

    public String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }

}
