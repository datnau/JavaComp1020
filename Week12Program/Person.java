public class Person {
    private String name;
    private int age;
    private Phone[] phoneDetails;

    public Person() {
        phoneDetails = new Phone[5];
    }

    public void addPerson(String name, int age, Phone[] phoneDetails) {
        this.name = name;
        this.age = age;
        this.phoneDetails = phoneDetails;
    }

    @Override
    public String toString() {
        String result = "Name: " + name + "Age: " + age;
        for (Phone phone : phoneDetails) {
            if (phone != null) {
                result += "Phone Details: " + phone.toAnotherString() + "\n";
            }
        }
        return result;
    }
}
