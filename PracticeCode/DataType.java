public class DataType {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        /*
         * Must use double quotes for literals ""
         * Single quotes '' are not allowed for strings, unlike python
         */

        // Các kiểu dữ liêu trong java

        int intValue = 2147483647; /*
                                    * đây là kiểu lưu trữ số nguyên
                                    * có kích cỡ 4 byte (32 bits) và có giá trị tối thiểu
                                    * là -2,147,483,648 đến 2,147,483,648
                                    */

        long longValue = 9223372036854775807L; // đây là kiểu lưu trữ số nguyên
                                               // nhưng với kích cỡ lớn hơn int lên đến 8byte (64bits)

        float floatValue = 3.14f;
        double doubleValue = 3.14; // nếu thêm hậu tố d thì kiểu dữ liệu sẽ cho ra là double
                                   // hoặc không thêm d hoặc f thì kiểu dữ liệu sẽ mặc định là double

        /*
         * Kích thước bộ nhớ:
         * 
         * float: Chiếm 32 bit (4 bytes).
         * double: Chiếm 64 bit (8 bytes).
         * Độ chính xác:
         * 
         * float: Cung cấp độ chính xác tới khoảng 7 chữ số thập phân.
         * double: Cung cấp độ chính xác tới khoảng 15 chữ số thập phân.
         * Phạm vi giá trị:
         * 
         * float: Phạm vi giá trị của float là từ khoảng ±1.4e-45 đến ±3.4e+38.
         * double: Phạm vi giá trị của double là từ khoảng ±4.9e-324 đến ±1.7e+308.
         */

        boolean booleanValue = true; // kiểu dữ liệu chỉ cho hai giá trị là true hoặc false

        char charValue = 'a'; // kiểu dữ liêu để lưu trữ kí tự hay số nguyên ko âm
                              // use single quote to represent it, unlike a string

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(charValue);

        
        int result = charValue + 1;
        System.out.println(result);
        /*'a' + 1: Trong trường hợp này, Java sẽ chuyển đổi ký tự 'a' 
        thành giá trị số nguyên ASCII tương ứng (97) và sau đó thực hiện phép cộng 
        với số nguyên 1. Kết quả sẽ là một số nguyên 98, và không có lỗi xảy ra. */

    }
}
