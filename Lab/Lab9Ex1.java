public class Lab9Ex1 {
  public static void main(String args[]) {
    int[] list;

    list = createList();
    printList(list);
    System.out.println("\nThe maximum value is: " + findMax(list));
    System.out.println("\nPrinting the list backwards:");
    printListBackwards(list, list.length - 1);

    System.out.println("\nEnd of processing.");
  }

  public static int[] createList() {
    int[] list = { 20, 10, 50, 60, 70, 40, 30 };

    return list;
  }

  public static int findMax(int[] values) {
    return findMaxRecursive(values, 0);
  }

  public static int findMaxRecursive(int[] values, int position) {
    int result;

    if (position == values.length - 1) {
      result = values[position];
    } else {
      int maxInRest = findMaxRecursive(values, position + 1);
      int current = values[position];
      result = Math.max(current, maxInRest);
    }

    return result;
  }

  public static void printList(int[] array) {
    printArrayRecursively(array, 0);
  }

  public static void printArrayRecursively(int[] array, int pos) {
    if (pos == array.length - 1) {
      System.out.println(array[pos]);
    } else {
      System.out.print(array[pos] + " ");
      printArrayRecursively(array, pos + 1);
    }
  }

  public static void printListBackwards(int[] array, int pos) {
    if (pos < 0) {
      return;
    }
    System.out.print(array[pos] + " ");
    printListBackwards(array, pos - 1);
  }
}