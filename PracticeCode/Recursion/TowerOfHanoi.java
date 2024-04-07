package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disk: ");
        int numDisk = sc.nextInt();
        String A = "A";
        String B = "B";
        String C = "C";
        solveHanoi(numDisk, A, B, C);
        sc.close();
    }

    public static void solveHanoi(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println("move " + n + " from " + A + " to " + C);
        } else {
            solveHanoi(n - 1, A, C, B);
            System.out.println("move " + n + " from " + A + " to " + C);
            solveHanoi(n - 1, B, A, C);
        }
    }
}