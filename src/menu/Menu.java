package menu;

import userinteractions.Product;
import userinteractions.ReadCSV;
import userinteractions.ShoppingCart;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Menu {

    public void display() {

        String[] menuOptions = {"Home", "Category", "Products", "Service", "Cart", "Account", "Quit"};
        Scanner options = new Scanner(System.in);
        int choice;
        String preChoice;
        String bye = "Thank you for visiting the Penguin! See you again!";

        do {
            System.out.println("\nPlease select your options please!");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + ". " + menuOptions[i]);
            }

            while (true) {
                preChoice = options.next();
                String[] valid = new String[]{"1","2","3","4","5","6","7"};

                // Checks if user's input is valid
                if (Arrays.asList(valid).contains(preChoice)){
                    break;
            }
                System.out.println("Invalid choice");
            }
            choice = Integer.parseInt(preChoice);

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
                    new ReadCSV().displayAllProduct();
                    break;

                case 4:
                    ServiceMenu serviceMenu = new ServiceMenu();
                    serviceMenu.display();
                    break;

                case 5:
                    ShoppingCartMenu shoppingCartMenu = new ShoppingCartMenu();
                    shoppingCartMenu.display();
                    break;

                case 6:
                    MyAccount myAccount = new MyAccount();
                    myAccount.display();
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
