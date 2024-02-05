public class Lab3Ex4 {
  public static void main(String[] args) {
    final int MAX_SIZE = 100;

    int[] array1 = new int[MAX_SIZE];
    int[] array2 = new int[MAX_SIZE];
    int[] array3 = new int[MAX_SIZE];
    int[] arrayAll = new int[MAX_SIZE];

    int size1 = (int) (Math.random() * MAX_SIZE / 10 + 1);
    int size2 = (int) (Math.random() * MAX_SIZE / 10 + 1);
    int size3 = (int) (Math.random() * MAX_SIZE / 10 + 1);
    int sizeAll = 0;

    fillArray(array1, size1);
    fillArray(array2, size2);
    fillArray(array3, size3);

    System.out.println("Array #1:");
    printArray(array1, size1);
    System.out.println("\nArray #2:");
    printArray(array2, size2);
    System.out.println("\nArray #3:");
    printArray(array3, size3);

    sizeAll = concatenateArrays(array1, size1, array2, size2, arrayAll, sizeAll);
    sizeAll = concatenateArrays(arrayAll, sizeAll, array3, size3, arrayAll, sizeAll);

    System.out.println("\nConcatenated array:");
    printArray(arrayAll, sizeAll);

    System.out.println("End of processing.");
  }

  public static int concatenateArrays(int[] a1, int size1, int[] a2, int size2, int[] result, int sizeResult) {
    int newSize = sizeResult;

    for (int i = 0; i < size1; i++) {
      result[newSize] = a1[i];
      newSize++;
    }

    for (int i = 0; i < size2; i++) {
      result[newSize] = a2[i];
      newSize++;
    }

    return newSize;
  }

  public static void fillArray(int[] array, int size) {
    for (int i = 0; i < size; i++) {
      array[i] = (int) (Math.random() * 10 + 1);
    }
  }

  public static void printArray(int[] array, int size) {
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
  }
}
