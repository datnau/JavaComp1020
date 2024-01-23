public class PersonTest{


public static void main(String[] args) {
    Person John = new Person();
    Person Jane = new Person();
    John.setAge(10);
    Jane.setAge(32);
    
    System.out.println("Person 1 age: " + John.getAge());  
    System.out.println("Person 2 age: " + Jane.getAge());  
    
    John.setSameAgeAs(Jane);
    John.compareTo(Jane);
    
    System.out.println("John age after setSameAgeAs: " + John.getAge());  
}
}