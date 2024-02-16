public class TestCar {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        fillArray(cars);
        printAllCars(cars);
        printCarsByMake(cars, "Ford");
        printCarsByMake(cars, "Toyota");
        printCarsByMake(cars, "Lada");
        printCarsByYearRange(cars, 1998, 2012);
        printCarsByYearRange(cars, 2019, 2020);
        printCarsByYearRange(cars, 2015, 2015);
        printCarsByYearRange(cars, 2025, 2027);
        printCarsByMileage(cars, true);
        printCarsByMileage(cars, false);
    }

    public static void fillArray(Car[] cars) {
        cars[0] = new Car("Ford", "Focus", 2010, 7.2);
        cars[1] = new Car("Ford", "Fiesta", 2005, 8.5);
        cars[2] = new Car("Toyota", "Corolla", 2015, 6.8);
        cars[3] = new Car("Toyota", "Camry", 2018, 8.0);
        cars[4] = new Car("Toyota", "RAV4", 2019, 7.5);
        cars[5] = new Car("Toyota", "Prius", 2012, 5.5);
        cars[6] = new Car("Honda", "Civic", 2010, 7.8);
        cars[7] = new Car("Honda", "Accord", 2008, 8.2);
        cars[8] = new Car("Nissan", "Altima", 2014, 7.0);
        cars[9] = new Car("Subaru", "Outback", 2016, 8.3);
    }

    public static void printAllCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public static void printCarsByMake(Car[] cars, String make) {
        System.out.println("Cars of make " + make + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car != null && car.getMake().equals(make)) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found for make " + make);
        }
        System.out.println();
    }

    public static void printCarsByYearRange(Car[] cars, int startYear, int endYear) {
        System.out.println("Cars between " + startYear + " and " + endYear + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car != null && car.getYear() >= startYear && car.getYear() <= endYear) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found between " + startYear + " and " + endYear);
        }
        System.out.println();
    }

    public static void printCarsByMileage(Car[] cars, boolean betterThan) {
        String comparison = betterThan ? "better than" : "worse than";
        double threshold = betterThan ? 10.0 : 10.0;
        System.out.println("Cars with mileage " + comparison + " " + threshold + " l/100km:");
        boolean found = false;
        for (Car car : cars) {
            if (car != null && (betterThan ? car.getMileage() < threshold : car.getMileage() > threshold)) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found with mileage " + comparison + " " + threshold + " l/100km");
        }
        System.out.println();
    }
}
