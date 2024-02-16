public class StudentList {
    private Student[] studentsArray;
    private int maxCapacity;
    private int currentCount;

    public StudentList(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.studentsArray = new Student[maxCapacity];
        this.currentCount = 0;
    }

    public boolean contains(Student student) {
        for (int i = 0; i < currentCount; i++) {
            if (studentsArray[i].equals(student)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Student student) {
        if (currentCount < maxCapacity && !contains(student)) {
            studentsArray[currentCount] = student;
            currentCount++;
            return true;
        }
        return false;
    }

    public boolean addStudent(Student student) {
        if (currentCount < maxCapacity && !contains(student)) {
            studentsArray[currentCount] = student;
            currentCount++;
            return true;
        }
        return false;
    }

    public boolean remove(Student student) {
        for (int i = 0; i < currentCount; i++) {
            if (studentsArray[i].equals(student)) {
                // Shift the remaining students
                for (int j = i; j < currentCount - 1; j++) {
                    studentsArray[j] = studentsArray[j + 1];
                }
                studentsArray[currentCount - 1] = null;
                currentCount--;
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return currentCount == 0;
    }

    public Student removeNext() {
        if (!isEmpty()) {
            Student nextStudent = studentsArray[0];
            remove(nextStudent);
            return nextStudent;
        }
        return null;
    }

    public int size() {
        return currentCount;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < currentCount; i++) {
            result.append(studentsArray[i].toString()).append("\n");
        }
        return result.toString();
    }
}
