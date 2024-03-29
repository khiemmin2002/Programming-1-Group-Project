package register;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class RegPage {
    private static String ID;
    private static String username;
    private static String name;
    private static String password;
    private static String phone;
    private static String address;
    private static String membership;

    public static void main(String[] args) {
        System.out.println("Please enter the following information to register new account");
//        ID = Validation.IDgenerate();
//        username = Validation.checkUsername();
        name = Validation.checkName();
//        password = Validation.checkPassword();
//        phone = Validation.checkPhoneFormat();
//        address = Validation.checkAddress();
//        membership = Validation.addMembership();
//        saveUserInfo(ID, username, name, address, phone, password, membership);

    }

    public static void saveUserInfo(String ID, String username,String name,String address, String phone,String password,String membership) {
        try {
            FileWriter fw = new FileWriter("src/Register/UserInfo.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);


            pw.println(ID + "," + username + "," + name + "," + address  + "," + phone + "," + password + "," + "," + membership);
            pw.flush();
            pw.close();
            System.out.println("Registration successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}