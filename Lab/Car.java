public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + "), Mileage: " + mileage + " l/100km";
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }
}
