public class Person {
    private String name;
    private int age;
    private int salary;

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
        return "Name: " + name + "Age: " + age + "Salary: " + salary;
    }
}
