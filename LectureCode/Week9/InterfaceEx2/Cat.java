
public class Cat implements IMakeNoise {

    private String name;
    private int age;

    public Cat(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void makesNoise() {
        System.out.println(name + " says Meow meow");

    }

    // public void eat(String f) {
    // System.out.println(name + " eats " + f);

    // }

    // public void drink() {
    // System.out.println(name + " drinks water");

    // }

    //////////////////////////////////////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

}