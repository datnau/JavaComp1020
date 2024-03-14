public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather(new int[] { -10, -20, -10, 0, 10, 20, 30, 30, 20, 10, 0, -10 });
        // weather.print();
        System.out.println(weather.getAvgTempMonth(6)); // July
        System.out.println(weather.getAvgTempDay(6, 8)); // July 9th
        System.out.println(weather.minTemp(11));
    }
}
