import java.util.*;

public class Course implements ITablePrinter {
    Scanner in = new Scanner(System.in);
    String faculty, code, name;

    public Course() {

    }

    public Course(String faculty, String code, String name) {
        this.faculty = faculty;
        this.code = code;
        this.name = name;
    }

    public void printHeader() {
        System.out.println("Faculty:Code:Name:");
        faculty = in.next();
        code = in.next();
        name = in.next();
    }

    public void printData() {
        System.out.printf("%8s %5s %s\n", faculty, code, name);
    }

    public void printHello() {
        System.out.println("Hello COMP1020");
    }

    public static void printInTable(ITablePrinter object) {
        // more fancy printing code not shown
        object.printHeader();
        object.printData();
    }

}
