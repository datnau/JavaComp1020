public class CourseList {
    private static final int MAX_COURSES = 100;
    private Course[] courses;
    private int numCourses;

    public CourseList() {
        courses = new Course[MAX_COURSES];
        numCourses = 0;
    }

    public boolean contains(Course course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return true;
            }
        }
        return false;
    }

    public void addCourse(Course course) {
        if (numCourses < MAX_COURSES) {
            courses[numCourses] = course;
            numCourses++;
        }
    }

    public String getAllTitles() {
        StringBuilder titles = new StringBuilder();
        for (int i = 0; i < numCourses; i++) {
            titles.append(courses[i].getTitles()).append("\n");
        }
        return titles.toString();
    }

    @Override
    public String toString() {
        StringBuilder courseList = new StringBuilder();
        for (int i = 0; i < numCourses; i++) {
            courseList.append(courses[i].toString()).append("\n");
        }
        return courseList.toString();
    }

    public void removeCourse(Course course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                break;
            }
        }
    }
}
