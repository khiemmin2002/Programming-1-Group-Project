package Register;

import userinteractions.Product;

import java.io.*;

public class RegPage {
    private static String username;
    private static String name;
    private static String password;
    private static String phone;
    private static String address;
    private static String membership;

    public static void main(String[] args) {
        System.out.println("Please enter the following information to register new account");
        username = Validation.checkUsername();
        name = Validation.checkName();
        password = Validation.checkPassword();
        phone = Validation.checkPhoneFormat();
        address = Validation.checkAddress();
        membership = Validation.addMembership();
        saveUserInfo(username, name, address, phone, password, membership);
    }

    public static void idGenerate() throws FileNotFoundException {
        String customerPath = "Customer.csv";
        String customerLine;
        try {
            BufferedReader br = new BufferedReader(new FileReader(customerPath));

            while ((customerLine = br.readLine()) != null) {
                String[] values = customerLine.split(",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveUserInfo(String username,String name,String address, String phone,String password,String membership) {
        try {
            FileWriter fw = new FileWriter("Customer.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("1" + "," + username + "," + name + "," + address  + "," + phone + "," + password + "," + "," + membership);
            pw.flush();
            pw.close();
            System.out.println("Registration successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}