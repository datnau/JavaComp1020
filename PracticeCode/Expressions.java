public class Expressions {
    public static void main(String[] args) {
        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;
        friends = friends / 3;
        System.out.println(friends); // trong trường hợp này giá trị luôn trả về số nguyên

        double a = 10;
        double results = (double) a / 3;
        System.out.println(results);// nểu muốn giá trị trả về số thực ta
                                    // phải chuyển sang kiểu dữ liệu double
    }
}
