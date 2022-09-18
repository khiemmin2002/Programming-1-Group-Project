package menu;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static userinteractions.sortProductByCategory.sortProductByCategory;
import static userinteractions.sortProductByPrice.sortProductByPrice;

public class CategoryMenu extends Menu {

    @Override
    public void display() {
        String[] menuOptions = {"Sort Products By Category", "Sort Product By Price", "Return to Home"};
        Scanner options = new Scanner(System.in);
        int choice;
        String preChoice;
        String alert = "You're currently in Category";
        String waitingMessage = "Please wait...";

        // Greet when start the program
        System.out.println("\n" + alert);


        do {
            System.out.println("\nPlease select your options please!");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + ". " + menuOptions[i]);
            }

            while (true) {
                preChoice = options.next();
                String[] valid = new String[] {"1","2","3","4","5","6"};

                // Checks if user's input is valid
                if (Arrays.asList(valid).contains(preChoice)) {
                    break;
                }
                System.out.println(preChoice + " is not a valid option! Please select again!");
            }
            choice = Integer.parseInt(preChoice);

            switch (choice) {

                case 1:
                    sortProductByCategory();
                    break;

                case 2:
                    sortProductByPrice();
                    break;


                case 3:
                    // Redirect users to the Home menu
                    System.out.println("Return to Home");
                    System.out.println(waitingMessage);
                    return;
            }

        } while (true) ;
    }
}
