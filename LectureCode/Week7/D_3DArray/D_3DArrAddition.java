public class D_3DArrAddition {
    public static void main(String[] args) {
        int[][][] arr1 = { { { 1, 2 }, { 3, 4 } }, { { 3, 4 }, { 5, 6 } } };
        int[][][] arr2 = { { { 2, 4 }, { 5, 6 } }, { { 2, 3 }, { 4, 5 } } };
        int[][][] res = new int[2][2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    res[i][j][k] = arr1[i][j][k] + arr2[i][j][k];

                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    System.out.print(res[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}