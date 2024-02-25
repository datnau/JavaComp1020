public class StringMethods_2 {
    public static void main(String[] args) {
        String s = "Hello World";

        // Converts the string to uppercase and prints it
        System.out.println(s.toUpperCase());

        // Converts the string to lowercase and prints it, but s remains unchanged
        System.out.println(s.toLowerCase()); // s not changed

        // Converts s to lowercase and assigns it back to s
        s = s.toLowerCase(); // s will be changed

        // Removes leading and trailing whitespace (including tabs and newlines) and
        // prints the result
        System.out.println(s.trim());/*
                                      * removes leading/trailing
                                      * whitespace (including tabs and newlines)
                                      */

        // Comparing strings lexicographically
        String string1 = "Goodbye";
        String string2 = "Hello";
        String string3 = "Hi";
        System.out.println(string1.compareTo(string2));
        // Returns a positive value if string2 is "greater" than string1
        System.out.println(string1.compareTo(string3));
        // Returns a negative value if string1 is "less" than string3

        /*
         * “less” or “greater” is determined by the numeric
         * codes (ASCII or Unicode) of the characters in that position
         * Letter codes are always in alphabetical order
         * Be careful: uppercase is always less than lowercase
         */
    }
}
