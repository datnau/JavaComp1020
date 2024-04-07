// Phone.java
public class Phone {
    private String modelName;
    private String modelNumber;
    private int releaseYear;
    private double price;

    public Phone(String modelName, String modelNumber, int releaseYear, double price) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone Details: " + modelName + ", Model Number: " + modelNumber + ", Release Year: " + releaseYear
                + ", Price: $" + price;
    }

    public String toAnotherString() {
        return "Phone Name: " + modelName + ", Model Number: " + modelNumber;
    }
}
