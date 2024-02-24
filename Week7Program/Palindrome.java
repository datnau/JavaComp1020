public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar != lastChar) {
            return false;
        }
        String remainingSubstring = str.substring(1, str.length() - 1);
        return isPalindrome(remainingSubstring);
    }

    public static void main(String[] args) {
        String str1 = "222";
        String str2 = "456";

        System.out.println(str1 + "\n" + isPalindrome(str1));
        System.out.println(str2 + "\n" + isPalindrome(str2));

    }
}
