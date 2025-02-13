public class F_BinarySearch {

      public static void main(String[] args) {
            int[] test = { 1, 3, 5, 7, 9 };
            int target = 4;
            int result = findTarget(test, target);
            System.out.println(result);
      }

      public static int findTarget(int[] data, int target) {
            int lo = 0, hi = data.length - 1;
            int ans = -1;

            while (lo <= hi) {
                  int mid = lo + (hi - lo) / 2;
                  if (data[mid] >= target) {
                        ans = data[mid];
                        hi = mid - 1;
                  } else {
                        lo = mid + 1;
                  }
            }
            return ans;
      }
}
