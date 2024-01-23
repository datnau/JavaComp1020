public class Person {

    private int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("this value: " + this);
        this.age = age;
    }

    public void haveBirthday() {
        age++;
        System.out.println("Age:" + age);
    }

    public void nameLength() {
        System.out.println("The number of characters in " + name + " are:" + name.length());
    }

}
