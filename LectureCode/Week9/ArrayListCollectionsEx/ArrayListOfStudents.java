import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfStudents implements IStudentList {
    private ArrayList<Student> students;

    public ArrayListOfStudents() {
        students = new ArrayList<>();
    }

    public void add(Student s) {
        students.add(s);
    }

    public Student find(int studentNumber) {
        for (Student student : students) {
            if (student.getStudentNumber() == studentNumber) {
                return student;
            }
        }
        return null;
    }

    public void remove(int studentNumber) {
        Student foundStudent = find(studentNumber);
        if (foundStudent != null) {
            students.remove(foundStudent);
        }
    }

    public void sortByName() {
        // selection sort
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students.get(j).compareTo(students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = students.get(i);
                students.set(i, students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }
    // public void sortByName() {
    // Collections.sort(students);
    // }

    public void printInTable() {
        System.out.println("Student Number\tName");
        for (Student student : students) {
            System.out.printf("%d\t\t%s\n", student.getStudentNumber(), student.getName());
        }
    }
}