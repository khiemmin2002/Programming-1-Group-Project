package fixbugmoingay.whatthe;

import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your phone number: ");
            String phoneInput = input.next();

            if (phoneInput.matches("^\\d+$")) { // Kiểm tra sdt chỉ bao gồm số
                String phoneFormat = phoneInput.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
                System.out.println(phoneFormat);
                break;
            } else {
                System.out.println("You can't enter non-digit value!"); // Nhắc ng dùng chỉ nhập số, ko có chữ
            }
        }


    }
}
