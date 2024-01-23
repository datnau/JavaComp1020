public class PersonSpouseExample {
  public static void main(String[] args) {
    Person p1 = new Person("George", 31);
    System.out.println(p1);
    Person p2 = new Person("Maggie", 25, p1);
    System.out.println(p2);
    Person p3 = new Person("Paul", 31);

    System.out.println(p1);
    System.out.println(p2);

    System.out.println("**** marries***");
    p1.marries(p2);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p1.isMarried());
    System.out.println(p2.isMarried());
    System.out.println(p1.getSpouse());
    System.out.println(p2.getSpouse());

    // System.out.println("\n**** divorces***");
    // p2.divorces();
    // System.out.println(p1);
    // System.out.println(p2);
    // System.out.println(p1.isMarried());
    // System.out.println(p2.isMarried());
    // System.out.println(p1.getSpouse());
    // System.out.println(p2.getSpouse());

    // System.out.println("\n**** marries***");
    // p2.marries(p3);
    // System.out.println(p2);
    // System.out.println(p3);
    // System.out.println(p2.isMarried());
    // System.out.println(p3.isMarried());
    // System.out.println(p2.getSpouse());
    // System.out.println(p3.getSpouse());

  }

}