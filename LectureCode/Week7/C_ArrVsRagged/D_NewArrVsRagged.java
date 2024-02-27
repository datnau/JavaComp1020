public class D_NewArrVsRagged {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        int[][] raggedArr = new int[2][];
        raggedArr[0] = new int[2];
        raggedArr[1] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;

            }
        }
        for (int i = 0; i < raggedArr.length; i++) {
            for (int j = 0; j < raggedArr[i].length; j++) {
                raggedArr[i][j] = j;

            }
        }
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
