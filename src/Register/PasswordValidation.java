package Register;//package fixbugmoingay.whatthe;

import java.util.Scanner;

public class PasswordValidation {
    private static String password;
    public static void checkPassword() {
        Scanner passwordInput = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = passwordInput.nextLine();

        /*
        CHECKING PASSWORD RULES

        It contains at least 8 characters and at most 20 characters. .{8,20}
        It contains at least one digit. (?=.*\d)
        It contains at least one upper case alphabet. (?=.*[A-Z])
        It contains at least one lower case alphabet. (?=.*[a-z])
        It contains at least one special character which includes !@#$%&*()-+=^. (?=.*[^a-zA-Z\d])
        It doesn’t contain any white space. (?=\S+$)

        Ex: Pass@word29
        */

        /*if (passwordInput.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z\\d])(?=\\S+$).{8,20}$")) {
            return validStatus;
        }*/

        if (password == null) {
            System.out.println("Please enter the necessary field:");
            password = passwordInput.nextLine();
            // Prompting users if the password's length is less than 8 or more than 20 characters
            if (password.length() < 8 || password.length() > 20) {
                System.out.println("The password must be longer than 8 characters and not exceed 20 characters.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();
            }

            // Prompting users if the password does not contain at least 1 digit
            if (!password.matches("(.*\\d.*)")) {
                System.out.println("The password must contain at least 1 digit.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();
            }

            // Prompting users if the password does not contain a lowercase character
            if (!password.matches("(.*[a-z].*)")) {
                System.out.println("The password must contain at least a lowercase character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();
                return;
            }

            // Prompting users if the password does not contain a lowercase character
            if (!password.matches("(.*[A-Z]).*")) {
                System.out.println("The password must contain at least an uppercase character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            }

            // Prompting users if the password does not contain a special character
            if (!password.matches("(.*[^a-zA-Z\\d].*)")) {
                System.out.println("The password must contain at least a special character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();
            }

            // Prompting users if the password contains a whitespace character
            if (!password.matches("(\\S+$)")) {
                System.out.println("The password do not contain any whitespace character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            }
        } else {
            System.out.println(password + " is valid");

        }
    }
    public String getPassword() {
        return password;
    }

    public static void setPassword(String newpassword) {
        password = newpassword;
    }
}
