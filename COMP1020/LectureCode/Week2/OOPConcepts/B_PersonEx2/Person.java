public class Person {
    public int id;
    public int age;
    public String name;

    public void haveBirthday() {
        age++;
        System.out.println("Age:" + age);
    }

    public int nameLength() {
        return name.length();
    }

}
