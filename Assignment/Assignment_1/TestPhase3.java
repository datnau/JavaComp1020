public class TestPhase3 {
    public static void main(String[] args) {
        // Creating students
        Student s1 = new Student("John", "Smith", 100001);
        Student s2 = new Student("Jane", "Doe", 100002);
        Student s3 = new Student("Carlos", "Garcia", 100003);
        Student s4 = new Student("Ananya", "Patel", 100004);
        Student s5 = new Student("Sacha", "Davidov", 100005);
        Student s6 = new Student("Paris", "Carver", 100006);
        Student s7 = new Student("Henry", "Gupta", 100007);
        Student s8 = new Student("Xenia", "Onatopp", 100008);

        // Creating COMP1010 course
        Course comp1010 = new Course("Introductory Computer Science 1", "COMP1010", 6);

        // Registering students to COMP1010
        comp1010.register(s1);
        comp1010.register(s2);
        comp1010.register(s3);
        comp1010.register(s4);
        comp1010.register(s5);
        comp1010.register(s6);
        comp1010.register(s7); // Henry Gupta on waitlist
        comp1010.register(s8); // Xenia Onatopp on waitlist

        // Printing initial state
        System.out.println(comp1010);

        // Withdrawing a student from the waitlist
        comp1010.withdraw(s7);
        System.out.println(comp1010);

        // Withdrawing a student who is registered
        comp1010.withdraw(s1);
        System.out.println(comp1010);

        // Registering a student from the waitlist
        comp1010.register(s1);
        System.out.println(comp1010);

        // Withdrawing a student who was on the waitlist
        comp1010.withdraw(s8);
        System.out.println(comp1010);

        // Withdrawing a student who is not on any list
        comp1010.withdraw(s2);
        System.out.println(comp1010);
    }
}
