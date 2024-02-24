public class CloningObject {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Your name is: " + name + "\nYour age is: " + age;
        }

        public Person clone() {
            return new Person(name, age);
        }

        // Deep copy implementation
        // public Person clone() {
        // Person newPerson = new Person();
        // newPerson.name = this.name;
        // newPerson.age = this.age;
        // return newPerson;
        // }
    }

    public static void main(String[] args) {
        // Shallow copy
        Person one, two;
        one = new Person("Fred", 29);
        two = one;
        System.out.println("Object is: \n" + one);
        System.out.println("\nA shallow copy is: \n" + two); // This prints the same as 'one'
        // Any changes to one of them will affect the other

        // Deep copy
        Person person1 = new Person("Thanh Dat", 19);
        System.out.println("\nObject is: \n" + person1);
        Person person2 = person1.clone();
        System.out.println("\nA deep copy is: \n" + person2); // This prints the same as 'person1'
        // A change to one will not affect the other
        // This is not an issue with String objects (or other "immutable" objects
        // because they can't be changed)
    }
}
