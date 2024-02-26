package Excepion;

import java.util.Scanner;

public class ExceptionMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Nhap vao so nguyen n: ");
            n = in.nextInt();
            in.close();
        } catch (Exception e) {
            System.out.println("Nhap du lieu khong dung!");
        } finally {
            System.out.println("Ket thuc chuong trinh!");

        }
        System.out.println("Gia tri cua n la " + n);

    }
}
