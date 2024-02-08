public class C_StringOpsEx2 {
    public static void main(String[] args) {

        String s1 = "International College of Manitoba";
        String s2 = "International College of Manitoba of Winnipeg";
        System.out.println("Comparing Strings: " + s2.compareTo(s1));
        System.out.println(("Finding the index: " + s2.indexOf(s1)));
    }

}
