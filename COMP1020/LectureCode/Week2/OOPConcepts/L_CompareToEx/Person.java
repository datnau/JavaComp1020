public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int ageComparison = Integer.compare(this.age, otherPerson.getAge());

        if (ageComparison == 0) {
            // If ages are equal, compare based on names
            return this.name.compareTo(otherPerson.getName());
        }

        return ageComparison;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.compareTo(person2)); // Output: -1
        System.out.println(person2.compareTo(person1)); // Output: 1
        System.out.println(person1.compareTo(person3)); // Output: -1
        System.out.println(person3.compareTo(person2)); // Output: -1
        System.out.println(person2.compareTo(person3)); // Output: 1
        System.out.println(person1.compareTo(person1)); // Output: 0
    }
}
