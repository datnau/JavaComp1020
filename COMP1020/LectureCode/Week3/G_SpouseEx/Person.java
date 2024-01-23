public class Person {

    // instance variables
    private String name;
    private int age;
    private Person spouse; // null means no spouse

    private static int population = 0;

    // constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        population++; // class variable

    }

    public Person(String name) {
        this.name = name;
        population++; // class variable

    }

    public Person(String who, int currentAge, Person otherHalf) {
        name = who;
        age = currentAge;
        spouse = otherHalf;
        // make sure the other person is married, too!
        if (otherHalf != null)
            otherHalf.spouse = this;
        population++;
    }//

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

    public void setName(String name) {
        this.name = name;
    }

    // our class methods
    public static int increasePopulation() {
        return population; // note that method has the word "static" that means that is a class method
    }

    public void marries(Person other) {
        spouse = other;
        if (other != null)
            other.spouse = this;
    }// marries

    public void divorces() {

        if (spouse != null) {

            spouse.spouse = null; // used to set the spouse that object to null; George marries Maggie. Set Maggie
                                  // to null

            spouse = null; // set the object to null; Sets George to null

        }
    }// divorces

    public boolean isMarried() {
        return spouse != null; // don’t use an IF here, useless!
    }

    public Person getSpouse() {
        return spouse; // note: returns null if not married
    }

    // our toString method
    @Override
    public String toString() {
        String currentSpouse = null;
        if (spouse != null) {
            currentSpouse = spouse.getName();
        }

        return "Person [name=" + name + ", age=" + age + ", ] Spouse: " + currentSpouse + " Population: " + population;

    }

}