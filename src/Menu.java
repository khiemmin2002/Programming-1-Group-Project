import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        String[] menuOptions = {"Home", "Category", "Deals", "Service & Repair", "Community", "Quit"};
        Scanner options = new Scanner(System.in);
        int numbers;
        String greeting = "Welcome to the Putin store";
        String bye = "Goodbye!";

        while (true) {
            System.out.println(greeting);
            System.out.println("Please select the label that you wish for!");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + " " + menuOptions[i]);
            }
            numbers = options.nextInt();
            switch (numbers) {
                case 1 -> System.out.println("You're in the homepage");
                case 2 -> System.out.println("You're in the category");
                case 3 -> System.out.println("You're in the deals");
                case 4 -> System.out.println("You're in the service & repair");
                case 5 -> System.out.println("You're in the community");
                case 6 -> {
                    System.out.println(bye);
                    return;
                }
                default -> System.out.println("No selection");
            }
        }
    }

}
