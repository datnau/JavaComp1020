import java.util.ArrayList;

public class InterfaceTest {
    public static void main(String[] args) {
        ////////////////////////////////////////////////

        // Course course = new Course();
        // course.printHeader();

        // course.printData();

        ////////////////////////////////////////////////
        // Course course = new Course();
        // ITablePrinter printableObject;
        // printableObject = course;
        // printableObject.printHeader();
        // printableObject.printData();

        ////////////////////////////////////////////////

        // ITablePrinter printableObject = new Course();

        // Course.printInTable(printableObject);

        ////////////////////////////////////////////////

        ArrayList<ITablePrinter> printable = new ArrayList<>();

        printable.add(new Course("F1", "C1", "N1"));
        printable.add(new Course("F2", "C2", "N2"));

        for (ITablePrinter p : printable) {
            p.printData();
        }

        ////////////////////////////////////////////////

        // ITablePrinter printableObject = new Course();
        // printInTable(printableObject);
        // }

        // public static void printInTable(ITablePrinter object) {
        // object.printHeader();
        // object.printData();
    }

}
