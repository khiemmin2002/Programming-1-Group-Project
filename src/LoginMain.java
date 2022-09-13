import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginMain {
    public static void main (String[] args) {
        IDandPasswords j = new IDandPasswords();

        LoginPage loginpage = new LoginPage(j.getLoginInfo());

    }
}