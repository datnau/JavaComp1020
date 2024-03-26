public class Student implements Comparable<Student> {
    private int studentNumber;
    private String name;

    public Student(int studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student other) {
        int nameTemp = name.compareTo(other.name);

        if (nameTemp == 0) {
            return Integer.compare(studentNumber, other.studentNumber);
        }

        return nameTemp;
    }
}