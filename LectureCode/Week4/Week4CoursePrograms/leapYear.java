public class leapYear {
    public static void main(String[] args) {
        int[] years = { 1808, 1849, 1900, 1916, 2000, 2013 };
        int[] leapYear = new int[years.length];
        leapOrNot(years, leapYear);
        for (int i = 0; i < leapYear.length; i++) {
            System.out.println(leapYear[i]);
        }
    }

    public static void leapOrNot(int[] array, int[] leapYear) {
        for (int i = 0; i < array.length; i++) {
            if (years[i] % 4 == 0 && (years[i] % 100 != 0 || years[i] % 400 == 0)) {
                leapYear[i] = years[i];
            }
        }
    }
}
