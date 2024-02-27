public class Weather {
    private final int[] DAYS_IN_A_MONTH = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final String[] MONTH_NAMES = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec" };
    private final int HOURS_IN_A_DAY = 24;
    private final int NOON = 12;

    private int[][][] weather;
    private int[] averages;

    public Weather() {
        weather = new int[12][][];
        for (int i = 0; i < 12; i++) {
            weather[i] = new int[DAYS_IN_A_MONTH[i]][HOURS_IN_A_DAY];
        }
        averages = new int[12];
    }

    public Weather(int[] averages) {
        weather = new int[12][][];
        for (int i = 0; i < 12; i++) {
            weather[i] = new int[DAYS_IN_A_MONTH[i]][HOURS_IN_A_DAY];
        }
        this.averages = averages;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < DAYS_IN_A_MONTH[i]; j++) {
                generateTempsForEachHour(weather[i][j], averages[i]);
            }
        }
    }

    public static void generateTempsForEachHour(int[] hourlyTemps, int meanDayTemp) {
        // this method fills up the hourlyTemps array with
        // temperatures close to the meanDayTemp}
        for (int i = 0; i < hourlyTemps.length; i++) {
            hourlyTemps[i] = getRandomIntAroundMean(meanDayTemp, 10);
        }
    }

    public static int getRandomIntAroundMean(int mean, int plusOrMinus) {
        // this method generates a random int, centered around “mean”,
        // plus or minus a certain value
        int min = plusOrMinus * -1;
        int max = plusOrMinus;
        int number = mean + (int) (Math.random() * (max - min + 1) + min);
        return number;
    }

    public String toString() {
        String toReturn = "";
        for (int i = 0; i < 12; i++) {
            toReturn += MONTH_NAMES[i] + "(" + averages[i] + ")\n";
            for (int j = 0; j < DAYS_IN_A_MONTH[i]; j++) {
                toReturn += "\t" + (j + 1) + "\n\t";
                for (int k = 0; k < 24; k++) {
                    toReturn += String.format("%3d ", weather[i][j][k]);
                }
                toReturn += "\n";
            }
            toReturn += "\n";
        }
        return toReturn;
    }

    public void print() {
        System.out.println(toString());
    }

    public double getAvgTempDay(int month, int day) {
        // returns the avg temperature for the day (double)
        double avg = 0f;
        for (int i = 0; i < 24; i++) {
            avg += weather[month][day][i];
        }
        avg /= 24;
        return avg;
    }

    public double getAvgTempMonth(int month) {
        // returns the avg temperature for the month (double)
        double avg = 0f;
        for (int i = 0; i < DAYS_IN_A_MONTH[month]; i++) {
            avg += getAvgTempDay(month, i);
        }
        avg /= DAYS_IN_A_MONTH[month];
        return avg;
    }

}
