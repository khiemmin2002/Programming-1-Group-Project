package Register;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import static Register.Validation.checkName;
import static Register.Validation.checkPassword;

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
        ID = IDgenerate();
        username = Validation.checkUsername();
        name = Validation.checkName();
        password = Validation.checkPassword();
        phone = Validation.checkPhoneFormat();
        address = Validation.checkAddress();
        membership = Validation.addMembership();
        saveUserInfo(ID, username, name, address, phone, password, membership);
    }

    public static String IDgenerate() {
        int count = 0;
        int[] array = new int[9999];
        int pre_count = 0;
        String ID = new String();
        do {
            count++;
            if (count != 0) {

            }
            int first = count;
            int second_part = (int) (Math.random() * 9999);
            ID = "C"+ "00"+ first + "-" + second_part;
            System.out.println(ID);
        } while (count==0);
        return ID;
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