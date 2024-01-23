public class ImmutableObject {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.hashCode());
        s = s + "World";
        System.out.println(s.hashCode());

    }

}
