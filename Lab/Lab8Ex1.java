import java.util.ArrayList;

public class Lab8Ex1 {

  public static void main(String[] args) {
    StudentList studentList = new StudentList();

    studentList.add("Archie", "Andrews", 708, 3.21);
    studentList.add("Chris", "Cross", 321, 4.28);
    studentList.add("Danny", "Du", 899, 3.27);
    studentList.add("Alexandra", "Andrews", 506, 4.02);
    studentList.add("Betty", "Boschwitz", 102, 3.58);
    studentList.add("Amelia", "Andrew", 325, 3.18);
    studentList.add("Duplicate", "Student", 708, 1.11);
    // studentList.add(null, "Not Null", 1, 1.11); // Uncomment to test invalid
    // student
    // studentList.add("Not Null", null, 2, 1.11); // Uncomment to test invalid
    // student
    // studentList.add("Bad", "Number", -3, 1.11); // Uncomment to test invalid
    // student
    // studentList.add("Bad", "GPA", 4, -1.11); // Uncomment to test invalid student

    System.out.println("Before sorting by number:");
    System.out.println(studentList);

    studentList.sort();

    System.out.println("\nAfter sorting by number:");
    System.out.println(studentList);

    System.out.println("\nSorting by GPA:");
    studentList.sortByGPA();
    System.out.println(studentList);

    System.out.println("\nEnd of processing.");
  }
}

class StudentList {
  private ArrayList<Student> students;

  public StudentList() {
    students = new ArrayList<>();
  }

  public void add(String first, String last, int num, double gpa) {
    if (first != null && last != null && num > 0 && gpa >= 0 && !containsStudentNum(num)) {
      students.add(new Student(first, last, num, gpa));
    } else {
      System.out.println("Invalid student: " + first + " " + last);
    }
  }

  private boolean containsStudentNum(int num) {
    for (Student student : students) {
      if (student.getNumber() == num) {
        return true;
      }
    }
    return false;
  }

  public void sort() {
    Student temp;
    for (int i = 0; i < students.size() - 1; i++) {
      for (int j = 0; j < students.size() - i - 1; j++) {
        if (students.get(j + 1).numberLessThanOther(students.get(j))) {
          temp = students.get(j);
          students.set(j, students.get(j + 1));
          students.set(j + 1, temp);
        }
      }
    }
  }

  public void sortByGPA() {
    Student temp;
    for (int i = 0; i < students.size() - 1; i++) {
      for (int j = 0; j < students.size() - i - 1; j++) {
        if (students.get(j + 1).gpaLessThanOther(students.get(j))) {
          temp = students.get(j);
          students.set(j, students.get(j + 1));
          students.set(j + 1, temp);
        }
      }
    }
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < students.size(); i++) {
      result.append(String.format("%3d - %s\n", i + 1, students.get(i)));
    }
    return result.toString();
  }
}

class Student {
  private String first, last;
  private int num;
  private double gpa;

  public Student(String first, String last, int num, double gpa) {
    this.first = first;
    this.last = last;
    this.num = num;
    this.gpa = gpa;
  }

  public boolean numberLessThanOther(Student other) {
    return num < other.num;
  }

  public boolean gpaLessThanOther(Student other) {
    return gpa > other.gpa;
  }

  public int getNumber() {
    return num;
  }

  public String toString() {
    return String.format("%d: %s, %s (GPA=%.2f)", num, last, first, gpa);
  }
}
