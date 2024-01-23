public class Person {
    // int id;
    private int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public void setAge(int age) {
    // age = age;
    // }

    public void haveBirthday() {
        age++;
        System.out.println("Age:" + age);
    }

    public void nameLength() {
        System.out.println("The number of characters in " + name + " are:" + name.length());
    }

}
