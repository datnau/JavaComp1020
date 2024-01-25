public class StringMethods {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String name1 = "Brown";
        if (name1.equals("brown")) {
            System.out.println("String are equal"); // it's false because b not equals with B
        } else {
            System.out.println("String are not equals");
        }

        String name2 = "Dat";
        if (name2.equalsIgnoreCase("dat")) {
            System.out.println("String are equal, ignoring case");
        }

        String name3 = "ThanhDat";
        System.out.println(name3.length());
        System.out.println(name3.charAt(1));
        System.out.println(name3.indexOf('T'));
        System.out.println(name3.toUpperCase());
        System.out.println(name3.toLowerCase());
        System.out.println(name3.trim());
        System.out.println(name3.replace('a', 'o'));

    }
}
