public class FundamentalString {
    public static void main(String[] args) {
        String s1 = "Hello, world!";
        String s2 = "world";
        System.out.println(s1.indexOf(s2));
        // Find the position of the word of s2 in s1
        // If not there at all, return -1

        String s3 = s1.substring(0, 5);
        System.out.println(s3);

        String s4 = "Hello@Hi@Salut";
        String SPLIT_STRING[] = s4.split("@");
        for (int i = 0; i < SPLIT_STRING.length; i++) {
            System.out.println(SPLIT_STRING[i]);
        }

    }
}
