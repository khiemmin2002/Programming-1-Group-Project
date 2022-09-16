package Register;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class RegPage {
    private static String username;
    private static String password;
    private static String email;
    private static String phone;
    private static String address;

    public static void main(String[] args) {
        System.out.println("Please enter the following information to register new account");
        username = Validation.checkUsername();
        password = Validation.checkPassword();
        email = Validation.checkEmailFormat();
        phone = Validation.checkPhoneFormat();
        address = Validation.checkAddress();
        saveUserInfo(username, password, email, phone, address);
    }

    public static void saveUserInfo(String username, String password, String email, String phone, String address) {
        try {
            FileWriter fw = new FileWriter("src/Login/UserInfo.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(username + "," + password + "," + email + "," + phone + "," + address);
            pw.flush();
            pw.close();
        } catch (Exception e) {
        }
    }
}