public class D_StringSplitEx {
    public static void main(String args[]) {
        String s = "Sarada@icm . com";
        String[] str = s.split(".");
        for (String t : str)
            System.out.println(t);
        System.out.println("All the elemets is the string array are:");
        for (String i : str) {
            System.out.println(i);
        }
        // String s1 = "This is the test";
        // String[] str1 = s1.split("\\s+");
        // System.out.println("All the elemets is the string array are:");
        // for (String i : str1) {
        // System.out.println(i);
        // }

    }

}
