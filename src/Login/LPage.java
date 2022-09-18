package Login;

import java.io.*;
import java.util.Scanner;

public class LPage {

    private static String username;
    private static String password;
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();
        ValidateUserInfo(username, password);
    }


    public static void ValidateUserInfo (String username, String password)
    {
        String line1;
        String line2;
        try {
            BufferedReader us = new BufferedReader(new FileReader("src/Register/UserInfo.csv"));
            BufferedReader ad = new BufferedReader(new FileReader("src/Login/AdminInfo.csv"));

            while ((line1 = us.readLine()) != null && (line2 = ad.readLine()) != null) {
                String[] user_values = line1.split(",");
                String[] ad_values = line2.split(",");
                    if ((username.equals(user_values[1]) && password.equals(user_values[2])) || username.equals(ad_values[1]) && password.equals(ad_values[2])) {
                        System.out.println("You got access!");
                        Menu access = new Menu();
                        access.displayMenu();
                    }if (username.equals(user_values[1]) || username.equals(ad_values[1])){
                        System.out.println("Wrong password, please try again!");
                    } else {
                    System.out.println("Username doesn't exist!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

