package Excepion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the length of the array: ");
            int length = sc.nextInt();
            int[] nums = new int[length];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                nums[i] = sc.nextInt();
            }

            int target = 9;
            int[] result = twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a valid integer input.");
        } finally {
            System.out.println("***End of program***");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }
}
