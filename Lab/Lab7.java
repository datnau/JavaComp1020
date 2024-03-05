import java.util.ArrayList;

class Driver {
    private String name;
    private String dob;
    private int licenseExpiryYear;
    private boolean requiresGlasses;

    public Driver(String name, String dob, int licenseExpiryYear, boolean requiresGlasses) {
        this.name = name;
        this.dob = dob;
        this.licenseExpiryYear = licenseExpiryYear;
        this.requiresGlasses = requiresGlasses;
    }

    public void updateLicenseExpiryYear(int newExpiryYear) {
        if (newExpiryYear > this.licenseExpiryYear) {
            this.licenseExpiryYear = newExpiryYear;
        }
    }

    public String toString() {
        return "Name: " + name + ", DOB: " + dob + ", License Expiry Year: " + licenseExpiryYear
                + ", Requires Glasses: " + requiresGlasses;
    }
}

class Car {
    private String make;
    private String model;
    private int year;
    private Driver driver;`

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = null;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void removeDriver() {
        this.driver = null;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public String toString() {
        if (driver != null) {
            return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Driver: " + driver.toString();
        } else {
            return "Make: " + make + ", Model: " + model + ", Year: " + year + ", No driver";
        }
    }
}

public class Lab7 {
    public static void printDriversWithCars(ArrayList<Driver> drivers, ArrayList<Car> cars) {
        for (Driver driver : drivers) {
            System.out.println(driver.toString());
            for (Car car : cars) {
                if (car.getDriver() == driver) {
                    System.out.println("\tCar: " + car.toString());
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("John Doe", "1990-01-01", 2025, false));
        drivers.add(new Driver("Jane Smith", "1985-05-15", 2024, true));
        drivers.add(new Driver("Alice Johnson", "2000-10-20", 2023, false));
        drivers.add(new Driver("Bob Williams", "1978-03-10", 2026, true));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2015));
        cars.add(new Car("Honda", "Accord", 2020));
        cars.add(new Car("Ford", "Fiesta", 2018));
        cars.add(new Car("Chevrolet", "Malibu", 2019));

        cars.get(0).setDriver(drivers.get(0));
        cars.get(1).setDriver(drivers.get(1));
        cars.get(2).setDriver(drivers.get(2));
        cars.get(3).setDriver(drivers.get(0));

        System.out.println("Cars with drivers:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();

        cars.get(1).removeDriver();
        cars.get(2).setDriver(drivers.get(3));

        System.out.println("Cars with drivers after changes:");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();

        System.out.println("Drivers with cars:");
        printDriversWithCars(drivers, cars);
    }
}
