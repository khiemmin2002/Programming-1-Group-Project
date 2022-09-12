package fixbugmoingay.whatthe;

import java.util.Scanner;

public class PasswordValidation {
    public static boolean checkPassword() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");

        String passwordInput = input.nextLine();

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

        // Prompting users if the password's length is less than 8 or more than 20 characters
        if (passwordInput.length() < 8 || passwordInput.length() > 20) {
            System.out.println("The password must be longer than 8 characters and not exceed 20 characters.");
            return false;
        }

        // Prompting users if the password does not contain at least 1 digit
        if (!passwordInput.matches("(.*\\d.*)")) {
            System.out.println("The password must contain at least 1 digit.");
            return false;
        }

        // Prompting users if the password does not contain a lowercase character
        if (!passwordInput.matches("(.*[a-z].*)")) {
            System.out.println("The password must contain at least a lowercase character.");
            return false;
        }

        // Prompting users if the password does not contain a lowercase character
        if (!passwordInput.matches("(.*[A-Z]).*")) {
            System.out.println("The password must contain at least an uppercase character.");
            return false;
        }

        // Prompting users if the password does not contain a special character
        if (!passwordInput.matches("(.*[^a-zA-Z\\d].*)")) {
            System.out.println("The password must contain at least a special character.");
            return false;
        }

        // Prompting users if the password contains a whitespace character
        if (!passwordInput.matches("(\\S+$)")) {
            System.out.println("The password do not contain any whitespace character.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print(checkPassword());
    }
}
