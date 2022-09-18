import menu.Menu;

public class Main {
    public static void main(String[] args) {
        Welcome welcomeScreen = new Welcome();
        welcomeScreen.welcomeScreen();

        Menu menu = new Menu();
        menu.display();
    }
}
