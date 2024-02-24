public class StringLength {
    public static int findLength(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + findLength(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length = " + findLength(str));
    }
}
