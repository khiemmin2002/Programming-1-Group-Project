package registerGUI;

import loginGUI.UserInfo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class RegisterPage extends Component {

    public UserInfo newuser;
    private JFrame frame;
    private JPanel bottomPanel;
    private JPanel mainPanel;
    private JLabel registerLabel;
    private JLabel nameLabel;
    private JLabel passLabel;
    private JLabel confirmPassLabel;
    private JLabel addLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel msgLabel;
    private JTextField re_Name;
    private JTextField re_Email;
    private JTextField re_Phone;
    private JTextField re_Address;
    private JPasswordField re_Password;
    private JPasswordField re_ConfirmPassword;
    private JButton cancel_btn;
    private JButton reg_btn;

    public RegisterPage () {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(4, 1));
        frame.setTitle("Create a new account");
        frame.getContentPane().setBackground(new Color(-16));
        frame.setMinimumSize(new Dimension(450, 474));

        registerLabel = new JLabel("register", JLabel.CENTER);
        registerLabel.setFont(new Font("Serif", Font.BOLD, 28));

        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(-16));
        mainPanel.setForeground(new Color(-16777216));
        mainPanel.setLayout(new GridLayout(6, 2, 10, 0));
        Border padding = createEmptyBorder(0, 40, 0, 40);
        mainPanel.setBorder(padding);

        nameLabel = new JLabel("Username", JLabel.LEFT);
        nameLabel.setFont(new Font("Didot", Font.PLAIN, 14));
        nameLabel.setBackground(new Color(-16777216));
        nameLabel.setForeground(new Color(-16777216));
        re_Name = new JTextField();
        re_Name.setBackground(new Color(12303291));
        re_Name.setForeground(new Color(16777215));

        passLabel = new JLabel("Password", JLabel.LEFT);
        passLabel.setFont(new Font("Didot", Font.PLAIN, 14));
        passLabel.setBackground(new Color(-16777216));
        passLabel.setForeground(new Color(-16777216));
        re_Password = new JPasswordField();
        re_Password.setBackground(new Color(12303291));
        re_Password.setForeground(new Color(16777215));

        addLabel = new JLabel("Address", JLabel.LEFT);
        addLabel.setFont(new Font("Didot", Font.PLAIN, 14));
        addLabel.setBackground(new Color(-16777216));
        addLabel.setForeground(new Color(-16777216));
        re_Address = new JTextField();
        re_Address.setBackground(new Color(12303291));
        re_Address.setForeground(new Color(16777215));

        emailLabel = new JLabel("Email", JLabel.LEFT);
        emailLabel.setFont(new Font("Didot", Font.PLAIN, 14));
        emailLabel.setBackground(new Color(-16777216));
        emailLabel.setForeground(new Color(-16777216));
        re_Email = new JTextField();
        re_Email.setBackground(new Color(12303291));
        re_Email.setForeground(new Color(16777215));

        phoneLabel = new JLabel("Phone number", JLabel.LEFT);
        phoneLabel.setFont(new Font("Didot", Font.PLAIN, 14));
        phoneLabel.setBackground(new Color(-16777216));
        phoneLabel.setForeground(new Color(-16777216));
        re_Phone = new JTextField();
        re_Phone.setBackground(new Color(12303291));
        re_Phone.setForeground(new Color(16777215));

        confirmPassLabel = new JLabel("Confirmed password", JLabel.LEFT);
        confirmPassLabel.setFont(new Font("Didot", Font.PLAIN, 14));
        confirmPassLabel.setBackground(new Color(-16777216));
        confirmPassLabel.setForeground(new Color(-16777216));
        re_ConfirmPassword = new JPasswordField();
        re_ConfirmPassword.setBackground(new Color(12303291));
        re_ConfirmPassword.setForeground(new Color(16777215));

        bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(-16));
        bottomPanel.setForeground(new Color(-16777216));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        Border padds = createEmptyBorder(30, 0, 0, 30);
        bottomPanel.setBorder(padds);

        cancel_btn = new JButton("Forgot password?");
        cancel_btn.setFont(new Font("Didot", Font.PLAIN, 14));
        cancel_btn.setMargin(new Insets(10, 10, 10, 10));
        cancel_btn.setBackground(new Color(-16));
        cancel_btn.setForeground(new Color(-16777216));
        cancel_btn.addActionListener( e -> {
            cancelRegister();
        });

        reg_btn = new JButton("register");
        reg_btn.setFont(new Font("Didot", Font.PLAIN, 14));
        reg_btn.setMargin(new Insets(10, 10, 10, 10));
        reg_btn.setBackground(new Color(-16));
        reg_btn.setForeground(new Color(-16777216));
        reg_btn.addActionListener(e -> {
            registerUserInfo();
        });

        msgLabel = new JLabel("ok", JLabel.CENTER);
        msgLabel.setFont(new Font("Didot", Font.PLAIN, 14));

        mainPanel.add(nameLabel);
        mainPanel.add(re_Name);
        mainPanel.add(passLabel);
        mainPanel.add(re_Password);
        mainPanel.add(confirmPassLabel);
        mainPanel.add(re_ConfirmPassword);
        mainPanel.add(emailLabel);
        mainPanel.add(re_Email);
        mainPanel.add(phoneLabel);
        mainPanel.add(re_Phone);
        mainPanel.add(addLabel);
        mainPanel.add(re_Address);
        bottomPanel.add(reg_btn);
        bottomPanel.add(cancel_btn);

        frame.add(registerLabel);
        frame.add(mainPanel);
        frame.add(bottomPanel);
        frame.add(msgLabel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    UserInfo newuserinfo = new UserInfo();
    private void cancelRegister() {
        re_Name.setText("");
        re_Password.setText("");
        re_ConfirmPassword.setText("");
        re_Email.setText("");
        re_Phone.setText("");
        re_Address.setText("");
    }
    private void registerUserInfo() {
        String username = re_Name.getText();
        String password = String.valueOf(re_Password.getPassword());
        String passwordConfirm = String.valueOf(re_ConfirmPassword.getPassword());
        String email = re_Email.getText();
        String phone = re_Phone.getText();
        String address = re_Address.getText();

        if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

         /*
        CHECKING PASSWORD RULES

        It contains at least 8 characters and at most 20 characters. .{8,20}
        It contains at least one digit. (?=.*\d)
        It contains at least one upper case alphabet. (?=.*[A-Z])
        It contains at least one lower case alphabet. (?=.*[a-z])
        It contains at least one special character which includes !@#$%&*()-+=^. (?=.*[^a-zA-Z\d])
        It doesn’t contain any white space. (?=\S+$)

        Ex: Pass@word29
        */

        /*if (passwordInput.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z\\d])(?=\\S+$).{8,20}$")) {
            return validStatus;
        }*/

        // Prompting users if the password's length is less than 8 or more than 20 characters
        if (password.length() < 8 || password.length() > 20) {
            JOptionPane.showMessageDialog(this,
                    "The password must be longer than 8 characters and not exceed 20 characters.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompting users if the password does not contain at least 1 digit
        if (!password.matches("(.*\\d.*)")) {
            JOptionPane.showMessageDialog(this,
                    "The password must contain at least 1 digit.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompting users if the password does not contain a lowercase character
        if (!password.matches("(.*[a-z].*)")) {
            JOptionPane.showMessageDialog(this,
                    "The password must contain at least a lowercase character.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompting users if the password does not contain a lowercase character
        if (!password.matches("(.*[A-Z]).*")) {
            JOptionPane.showMessageDialog(this,
                    "The password must contain at least an uppercase character.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompting users if the password does not contain a special character
        if (!password.matches("(.*[^a-zA-Z\\d].*)")) {
            JOptionPane.showMessageDialog(this,
                    "The password must contain at least a special character.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompting users if the password contains a whitespace character
        if (!password.matches("(\\S+$)")) {
            JOptionPane.showMessageDialog(this,
                    "The password do not contain any whitespace character.",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(passwordConfirm)) {
            JOptionPane.showMessageDialog(this,
                    "Confirm Password does not match",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (phone.matches("^\\d+$")) { // Kiểm tra sdt chỉ bao gồm số
            String phoneFormat = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
            System.out.println(phoneFormat);
        } else {
            // Nhắc ng dùng chỉ nhập số, ko có chữ
            JOptionPane.showMessageDialog(this,
                    "You can't enter non-digit value!",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserInfo newuser = new UserInfo();
        newuser.AddUserInfo(username, email, phone, address, password);
        if (newuser != null) {
            JOptionPane.showMessageDialog(this,
                    "Loading...",
                    "Wait a minute",
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "Failed to register new user",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
