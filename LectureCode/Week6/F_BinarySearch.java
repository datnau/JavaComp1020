public class F_BinarySearch {

      public static void main(String[] args) {
            int[] test = { 3, 4, 7, 10, 13 };
            int key = 10;
            int index = binSearch(test, key);

            System.out.println(key + " is on index " + index);
      }

      private static int binSearch(int[] data, int lo, int hi, int key) {
            if (hi < lo) // There must be an easy non-recursive case
                  return -1;
            else {
                  int mid = (lo + hi) / 2;
                  if (data[mid] == key)
                        return mid;
                  else if (data[mid] < key)
                        return binSearch(data, mid + 1, hi, key); // Search top half
                  else
                        return binSearch(data, lo, mid - 1, key); // Search bottom half
            }

      }

      public static int binSearch(int[] data, int key) { // interface for the user
            return binSearch(data, 0, data.length - 1, key);
      }

}
