package menu;

import java.util.Arrays;
import java.util.Scanner;

public class MyAccount extends Menu {

    @Override
    public void display() {
        String[] menuOptions = {"Log In", "register", "Return to Home"};
        Scanner options = new Scanner(System.in);
        int choice;
        String preChoice;
        String alert = "You're currently in Service";
        String waitingMessage = "Please wait...";

        // Announce to the users which section they're currently in
        System.out.println("\n" + alert);


        do {
            System.out.println("\nPlease select your options please!");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + ". " + menuOptions[i]);
            }

            while (true) {
                preChoice = options.next();
                String[] valid = new String[] {"1","2","3"};

                // Checks if user's input is valid
                if (Arrays.asList(valid).contains(preChoice)) {
                    break;
                }
                System.out.println(preChoice + " is not a valid option! Please select again!");
            }
            choice = Integer.parseInt(preChoice);


            switch (choice) {

                case 1:
                    System.out.println("You're in the Log In");
                    break;

                case 2:
                    System.out.println("You're in the Register");
                    break;

                case 3:
                    // Redirect users to the Home menu
                    System.out.println("Return to Home");
                    System.out.println(waitingMessage);
                    return;

                default:
                    System.out.println(choice + " is not a valid option! Please select again!");
            }

        } while (true) ;
    }
}
