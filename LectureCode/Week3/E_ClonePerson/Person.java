public class Person {

    // instance variables
    private String name;
    private int age;
    private int height;

    private static int population = 0;

    // constructors
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        population++; // class variable

    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
        population++; // class variable

    }

    public Person clone() {
        return new Person(name, age, height);
    }

    // getters and setters methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    // our class methods
    public static int increasePopulation() {
        return population; // note that method has the word "static" that means that is a class method
    }

    public void setSameAgeAs(Person other) {
        this.age = other.age;
    }

    public void haveBirthday() {
        age++;
    }

    // our toString method
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + "] Population: " + population;
    }

    // class methods
    // this is a class method that receives a parameter Person. Person is the new
    // data type
    // for class method we need to use the object person, such as:
    // Person1.equalTo(Person2);
    public boolean equalTo(Person a) {
        boolean isTrue = false;
        if (a.getAge() == age) {
            isTrue = true;
        }
        return isTrue;

    }

    // for class method we need to use the object person, such as:
    // Person1.equalTo(Person2);
    // this is an example, but the best way to write this method is return a boolean
    // or person's name
    // this method creates a new object Person that increases population
    public Person isOlder(Person a) {
        Person p = new Person(this.name, this.age, this.height);
        population--;
        if (a.getAge() >= age) {
            return p;
        }

        return p;
    }

    public String isOlder2(Person a) {
        String oldPerson;
        if (a.getAge() >= age) {
            oldPerson = a.getName();
        } else {
            oldPerson = name;
        }

        return oldPerson;
    }

    /**
     * The changeToFoot returns the conversion of
     * the number passed into parameter.
     * To convert cm to foot, we multiply the given cm value by 0.032808399 ft.
     */
    public static double changeToFoot(int height) {
        return height * 0.032808399;
    }

    /**
     * Note:
     * static methods are defined on the class level and can
     * be used without creating instances.
     */

}