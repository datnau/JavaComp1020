public class leapYear {
    static int l = 0;

    public static void main(String[] args) {
        int[] years = { 1808, 1849, 1900, 1916, 2000, 2013 };
        int[] leapYear = new int[years.length];
        leapOrNot(years, leapYear);
        String s = "[";
        for (int i = 0; i < leapYear.length; i++) {
            if (leapYear[i] > 0) {
                s += leapYear[i];
                if (i < leapYear.length - 1) {
                    s += ", "; // Add comma only if it's not the last element
                }
            }
        }
        s += "]";
        System.out.println(s);

    }

    public static void leapOrNot(int[] array, int[] leapYear) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0 && array[i] % 100 != 0) {
                leapYear[l++] = array[i];
            } else if (array[i] % 4 != 0 && array[i] % 100 == 0) {
                leapYear[l++] = array[i];
            } else if (array[i] % 400 == 0) {
                leapYear[l++] = array[i];
            }
        }

    }
}
