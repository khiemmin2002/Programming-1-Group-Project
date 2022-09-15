package menu;

import entity.Product;

import java.util.Scanner;


public class Menu {

    public void display() {

        String[] menuOptions = {"Home", "Category", "Products", "Service", "Cart", "Log In/Register", "Quit"};
        Scanner options = new Scanner(System.in);
        int choice;
        String bye = "Thank you for visiting the Penguin! See you again!";

        do {
            System.out.println("\nPlease select your options please!");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + ". " + menuOptions[i]);
            }
            choice = options.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("You're already in the Homepage");
                    break;

                case 2:
                    CategoryMenu categoryMenu = new CategoryMenu();
                    categoryMenu.display();
                    break;

                case 3:
                    Product product = new Product();

                    // Provide instructions to make a purchase for users
                    product.purchaseInstruction();

                    // Read all values from Product file and display all the products
                    product.readProductFromFile();
                    break;

                case 4:
                    ServiceMenu serviceMenu = new ServiceMenu();
                    serviceMenu.display();
                    break;

                case 5:
                    System.out.println("You're in the Cart");
                    break;

                case 6:
                    LoginRegisterMenu loginRegisterMenu = new LoginRegisterMenu();
                    loginRegisterMenu.display();
                    break;

                case 7:

                    /*
                    Before quitting the program, users will be asked for if they really want to quit or not.
                    This step avoids users unwittingly select the "6 (Quit) option".
                     */

                    System.out.println("Are you sure to quit the program? [Y/N]");
                    String selection = options.next().toLowerCase();
                    if (selection.equals("y")) {
                        System.out.println(bye);
                        System.out.println("Exiting Program...");
                        System.exit(0);
                        break;
                    } else {
                        continue;
                    }
                default:
                    System.out.println(choice + " is not a valid option! Please select again!");

            }

        } while (true) ;
    }
}
