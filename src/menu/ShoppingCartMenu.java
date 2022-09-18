package menu;

import order.NormalOrder;
import userinteractions.ShoppingCart;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingCartMenu extends Menu{
    @Override
    public void display() {
        String[] menuOptions = {"View My Cart", "Add Items To Cart", "Place Order", "Return to Home"};
        Scanner options = new Scanner(System.in);
        int choice;
        String preChoice;
        String alert = "You're currently in Shopping Cart";
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
                String[] valid = new String[] {"1","2","3","4"};

                // Checks if user's input is valid
                if (Arrays.asList(valid).contains(preChoice)) {
                    break;
                }
                System.out.println(preChoice + " is not a valid option! Please select again!");
            }
            choice = Integer.parseInt(preChoice);

            switch (choice) {

                case 1:
                    System.out.println("You're in the View Cart");
                    break;

                case 2:
                    ShoppingCart myCart = new ShoppingCart();
                    myCart.addItems();
                    break;

                case 3:
                    NormalOrder normalOrder = new NormalOrder();
                    normalOrder.placeOrder();
                    break;

                case 4:
                    // Redirect users to the Home menu
                    System.out.println("Return to Home");
                    System.out.println(waitingMessage);
                    return;
            }

        } while (true) ;
    }
}
