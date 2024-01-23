package PracticeCode;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        /*
         * Khi bạn sử dụng nextInt(), nó chỉ đọc số nguyên và không đọc ký tự newline
         * (\n) nằm sau nó trong bộ đệm (buffer).
         * Khi bạn sau đó gọi nextLine(), nó sẽ đọc ký tự newline đã còn trong buffer
         * từ lần nhập trước đó và nó sẽ trả về một chuỗi trống mà không chờ bạn nhập gì
         * thêm.
         * Do đó, để giải quyết vấn đề này, bạn cần thêm một lời gọi nextLine() sau khi
         * sử dụng nextInt()
         * để "tiêu thụ" ký tự newline còn lại trong buffer. Điều này giúp chuẩn bị cho
         * lần nhập tiếp theo
         * bằng nextLine() mà không bị ảnh hưởng bởi ký tự newline còn lại từ lần nhập
         * trước.
         */
        System.out.println("What is your favourite food: ");
        String food = scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }

}
