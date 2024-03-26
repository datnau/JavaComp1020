public class TestClass {
    public static void main(String[] args) {
        IStudentList istudents = new ArrayListOfStudents();

        // Add students
        istudents.add(new Student(1, "John"));
        istudents.add(new Student(2, "John"));
        istudents.add(new Student(3, "Fred"));

        // Print
        System.out.println("Original List:");
        istudents.printInTable();

        // Sorting names
        istudents.sortByName();

        // Print the sorted list
        System.out.println("\nSorted List:");
        istudents.printInTable();

        // Remove a student with studentID
        istudents.remove(456);

        // Print again
        System.out.println("\nUpdated List:");
        istudents.printInTable();

        // Get a student with studentNumber
        Student found = istudents.find(1);
        if (found != null) {
            System.out.println("\nFound Student:");
            System.out.println("Student Number: " + found.getStudentNumber());
            System.out.println("Name: " + found.getName());
        } else {
            System.out.println("\nStudent not found.");
        }
    }
}