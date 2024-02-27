public class C_ArrVsRagged {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 } };
        int[][] raggedArr = { { 1, 2 }, { 1, 2, 3, 4, 5, 6 }, { 1 } };
        System.out.println("*****************Array**********************");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.println("Array" + "[" + i + "]" + "[" + j + "]" + ": " + arr[i][j]);
        }
        System.out.println("*****************Ragged Array**********************");
        for (int i = 0; i < raggedArr.length; i++) {
            for (int j = 0; j < raggedArr[i].length; j++)
                System.out.println("RaggedArray" + "[" + i + "]" + "[" + j + "]" + ": " + raggedArr[i][j]);
        }

    }

}
