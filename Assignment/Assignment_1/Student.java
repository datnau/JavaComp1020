public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private CourseList courseList;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.courseList = new CourseList();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public CourseList getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.addCourse(course);
    }

    public void removeCourse(Course course) {
        courseList.removeCourse(course);
    }

    public String getCourseListString() {
        return "The student " + lastName + " " + firstName + " (" + studentID + ") is registered to:\n"
                + courseList.getAllTitles();
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%d)", lastName, firstName, studentID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Student otherStudent = (Student) obj;
        return firstName.equals(otherStudent.firstName) &&
                lastName.equals(otherStudent.lastName) &&
                studentID == otherStudent.studentID;
    }
}
