package Login;

import java.util.HashMap;
import java.util.Scanner;

public class LPage {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.println("Enter your username: ");
        username = input.nextLine();
        System.out.println("Enter your password: ");
        password = input.nextLine();

        HashMap<String, String> loginInfo = new HashMap <String, String>();
        if (loginInfo.containsKey(username)) {
            if (password.equals(loginInfo.get(username))) {
                System.out.println("You got access!");
                Menu access = new Menu();
                access.displayMenu();
            } else {
                System.out.println("Wrong password, please try again!");
            }
        } else {
            System.out.println("Username doesn't exist!");
        }
    }
}
