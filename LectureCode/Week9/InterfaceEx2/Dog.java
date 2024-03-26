public class Dog implements IAnimalStuff {
    private String name;
    private int age;

    public Dog(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void drink() {
        System.out.println("Dog drinks watrer.");

    }

    public void eat(String food) {
        System.out.println("Dog eats " + food);

    }

    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }

}