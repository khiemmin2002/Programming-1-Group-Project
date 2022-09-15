package menu;

import java.util.Scanner;

public class CategoryMenu extends Menu {

    @Override
    public void display() {
        String[] menuOptions = {"Cell Phones", "Laptops", "Tablets", "TVs", "Video Games", "Return to Home"};
        Scanner options = new Scanner(System.in);
        int choice;
        String alert = "You're currently in Category";
        String waitingMessage = "Please wait...";

        // Greet when start the program
        System.out.println("\n" + alert);


        do {
            System.out.println("\nPlease select your options please!");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + ". " + menuOptions[i]);
            }
            choice = options.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("You're in the Cell Phones");
                    break;

                case 2:
                    System.out.println("You're in the Laptops");
                    break;

                case 3:
                    System.out.println("You're in the Tablets");
                    break;

                case 4:
                    System.out.println("You're in the PCs");
                    break;

                case 5:
                    System.out.println("You're in the Video Games");
                    break;

                case 6:
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
