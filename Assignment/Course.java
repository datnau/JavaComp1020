public class Course {
    public static final int WAITLIST_MAX_SIZE = 100;

    private String title;
    private String shortTitle;
    private int maxClassSize;
    private StudentList classList;
    private StudentList waitList;

    public Course(String title, String shortTitle, int maxClassSize) {
        this.title = title;
        this.shortTitle = shortTitle;
        this.maxClassSize = maxClassSize;
        this.classList = new StudentList(maxClassSize);
        this.waitList = new StudentList(WAITLIST_MAX_SIZE);
    }

    public void register(Student student) {
        if (classList.contains(student)) {
            System.out.println("The student " + student + " is already registered to " + shortTitle + "!");
        } else if (classList.size() < maxClassSize) {
            classList.add(student);
            student.addCourse(this); // Assuming Student class has a method to add a course to its course list
            System.out.println("The student " + student + " has been registered successfully to " + shortTitle + ".");
        } else if (waitList.contains(student)) {
            System.out.println("The student " + student + " is already on the waitlist for " + shortTitle + "!");
        } else if (waitList.size() < WAITLIST_MAX_SIZE) {
            waitList.add(student);
            System.out.println("The student " + student + " has been placed on the waitlist for " + shortTitle + ".");
        } else {
            System.out.println("The waitlist is full for " + shortTitle + "!");
        }
    }

    public void withdraw(Student student) {
        if (classList.contains(student)) {
            classList.remove(student);
            student.removeCourse(this);
            System.out.println("The student " + student + " has been withdrawn from " + shortTitle + ".");
            if (!waitList.isEmpty()) {
                Student nextStudent = waitList.removeNext();
                classList.add(nextStudent);
                nextStudent.addCourse(this);
                System.out.println(
                        "The student " + nextStudent + " from the waitlist has been registered to " + shortTitle + ".");
            }
        } else if (waitList.contains(student)) {
            waitList.remove(student);
            System.out
                    .println("The student " + student + " has been withdrawn from the waitlist of " + shortTitle + ".");
        } else {
            System.out.println("The student " + student + " is not on any list of " + shortTitle + ".");
        }
    }

    public String getTitles() {
        return shortTitle + " - " + title;
    }

    @Override
    public String toString() {
        return shortTitle + " - " + title + "\nClass List:\n" + classList + "\nWaitlist:\n" + waitList;
    }
}
