public class Q2_3DArray {
    public static void main(String[] args) {
        int[][][] temperature = {
                { { 30, 35, 32 }, { 28, 31, 29 }, { 33, 36, 34 } }, // Week 1
                { { 29, 33, 31 }, { 27, 30, 28 }, { 32, 35, 33 } }, // Week 2

        };

        int maxTemp = temperature[0][0][0];
        maxTemp = maxTemperature(temperature, maxTemp);
        System.out.println("Maximum temperature: " + maxTemp);
    }

    public static int maxTemperature(int[][][] array, int maxTemp) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > maxTemp) {
                        maxTemp = array[i][j][k];
                    }
                }
            }
        }
        return maxTemp;
    }
}
