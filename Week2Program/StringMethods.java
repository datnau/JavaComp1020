public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equalsIgnoreCase(s2));// True
        System.out.println(s1.length());// 5
        System.out.println(s1.charAt(4));// 0
    }
}
