package OOP;

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void ShowInfo() {
        System.out.println("Your name is: " + name + "You are " + age + "Your weight is: " + weight);
    }
}
