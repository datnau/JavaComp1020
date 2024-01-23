public class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSameAgeAs(Person other) {
        age = other.age;
    }

}