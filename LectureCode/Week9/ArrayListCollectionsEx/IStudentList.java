interface IStudentList {

    void add(Student s);

    void remove(int studentNumber);

    Student find(int studentNumber);

    void sortByName();

    void printInTable();
}
