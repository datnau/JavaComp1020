package Excepion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");

        try {
            int age = sc.nextInt();
            System.out.println("Your age is: ");
            int error = age / 0;
        } catch (InputMismatchException e) {
            System.out.println("Error!Please enter a number!");
        } catch (ArithmeticException e) {
            System.out.println("Can not be divided by zero");
        } catch (Exception e) {
            System.out.println("Catch all the exceptions");
        } finally {
            System.out.println("You are in the finally block!");
        }
        System.out.println("End of program");
        sc.close();
    }

}