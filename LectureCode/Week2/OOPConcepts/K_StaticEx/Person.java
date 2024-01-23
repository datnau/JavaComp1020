public class Person {
    private String name;
    private int age;

    Person(String n, int a) {
        name = n;
        age = a;
        population++;

    }

    public String toString() {
        return name + "(" + age + ")"; // e.g. Jane (42)
    }

    private static int population = 0;

    public static int census() {
        return population;
    }

}