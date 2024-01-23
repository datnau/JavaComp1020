public class A_PartialArrays {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int[] pa = new int[ARRAY_SIZE];
        int totalElements = 0;

        totalElements = insert(pa, totalElements, 6);
        totalElements = insert(pa, totalElements, 8);
        totalElements = insert(pa, totalElements, 9);
        totalElements = delete(pa, totalElements, 1);

        for (int i = 0; i < totalElements; i++) {
            System.out.println(pa[i]);
        }
    }

    public static int insert(int[] pa, int totalElements, int element) {
        pa[totalElements++] = element;

        return totalElements;
    }

    public static int delete(int[] pa, int totalElements, int position) {

        if (position >= 0 && position < totalElements) {
            for (int i = position; i < totalElements - 1; i++)
                pa[i] = pa[i + 1];
            totalElements--;
        }
        return totalElements;
    }

}