/*
 * Check to see if a String is a palindrome
 * Reads the same forward and backward
 * We want to do this while ignoring non-letters, leading/trailing space, and
 * case
 */

public class B_StringPptEx2 {
    public static void main(String[] args) {
        String s = "If I had a Hi-Fi12324";
        String s1 = "";
        String temp = "";
        s = s.toLowerCase();
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                s1 += s.charAt(i);
            }
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            temp += s1.charAt(i);
        }
        System.out.println("Original String: " + s);
        System.out.println("Changed String: " + s1);
        System.out.println("Palindrome string:" + temp);
        if (s1.equals(temp)) {
            System.out.println("Yes it is required result");

        } else {
            System.out.println("No it is not required result");
        }
    }
}
