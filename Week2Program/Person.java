public class Person {
    private String name;
    private int age;
    private int salary;

    // constructor
    public Person() {
        name = "newBorn";
        age = 1;
        salary = 23500;

    }

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // class method
    public static int cencus() {
        return cencus();

    }

    public void haveBirthday() {
        age++;

    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;

    }

    public int getage() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = (int) s;
    }

    public void setSameAge(Person p) {
        age = p.age;
    }

    public String toString() {
        return "Name: " + name + "\t" + "Age: " + age + "\t" + "Salary: " + salary;
    }
}
