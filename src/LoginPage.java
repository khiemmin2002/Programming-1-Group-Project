import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.Border;
import static javax.swing.BorderFactory.createEmptyBorder;

public class LoginPage implements ActionListener {
    private JFrame frame;
    private JPanel controlPanel;
    private JPanel bottomPanel;
    private JPanel mainPanel;

    private JTextField username;
    private JTextField password;
    private JButton log_btn;
    private JButton repass_btn;
    private JButton reg_btn;

    private JLabel userlabel;
    private JLabel passlabel;
    private JLabel loginlabel;
    private JLabel messagelabel;

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginOriginals) {
        logininfo = loginOriginals;

        frame = new JFrame();
        ///ko dc quên tạo parameters/ args ở đây nếu ko sẽ ko dùng dc public giữa các methods
        frame.setMinimumSize(new Dimension(450, 474));
        frame.setLayout(new GridLayout(5, 1));
        frame.setTitle("Login");
        ///lấy content pane là pane chính là frame còn mấy cái panel nằm trong
        //frame đó vẫn phải thêm code edit riêng
        frame.getContentPane().setBackground(new Color(-16));
        loginlabel = new JLabel("Login", JLabel.CENTER);
        loginlabel.setFont(new Font("Serif", Font.BOLD, 28));

        controlPanel = new JPanel();
        username = new JTextField();
        password = new JTextField();
        userlabel = new JLabel("Username", JLabel.CENTER);
        userlabel.setFont(new Font("Didot", Font.PLAIN, 14));
        passlabel = new JLabel("Password", JLabel.CENTER);
        passlabel.setFont(new Font("Didot", Font.PLAIN, 14));
        mainPanel = new JPanel();
        log_btn = new JButton("Sign in");
        log_btn.setFont(new Font("Didot", Font.BOLD, 15));
//        log_btn.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
//        log_btn.setBorderPainted(true);
        log_btn.setMargin(new Insets(10, 10, 10, 10));
        log_btn.addActionListener(this);

        ///Phải tạo trc r ms ms dc apply mấy cái edit vào method
        //frame phải add theo thứ tự
        //loginlabel xong controlPanel trc xong log_btn thì cái frame sẽ display theo thứ tự
        bottomPanel = new JPanel();
        repass_btn = new JButton("Forgot password?");
        repass_btn.setFont(new Font("Didot", Font.PLAIN, 14));
        repass_btn.setMargin(new Insets(10, 10, 10, 10));
        reg_btn = new JButton("Register");
        reg_btn.setFont(new Font("Didot", Font.PLAIN, 14));
        reg_btn.setMargin(new Insets(10, 10, 10, 10));
        reg_btn.addActionListener(this);
        messagelabel = new JLabel("", JLabel.CENTER);
        messagelabel.setFont(new Font("Didot", Font.PLAIN, 14));
        frame.add(loginlabel);
        frame.add(controlPanel);
        frame.add(mainPanel);
        frame.add(bottomPanel);
        frame.add(messagelabel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        controlPanel.setBackground(new Color(-16));
        controlPanel.setForeground(new Color(-16777216));
        controlPanel.setLayout(new GridLayout(2, 2, 10, 10));
        Border padding = createEmptyBorder(0, 40, 0, 40);
        controlPanel.setBorder(padding);
        userlabel.setBackground(new Color(-16777216));
        userlabel.setForeground(new Color(-16777216));
        username.setBackground(new Color(12303291));
        username.setForeground(new Color(16777215));

        passlabel.setBackground(new Color(-16777216));
        passlabel.setForeground(new Color(-16777216));
        password.setBackground(new Color(12303291));
        password.setForeground(new Color(16777215));
        loginlabel.setForeground(new Color(-16777216));
        controlPanel.add(userlabel);
        controlPanel.add(username);
        controlPanel.add(passlabel);
        controlPanel.add(password);

        mainPanel.setBackground(new Color(-16));
        mainPanel.setForeground(new Color(-16));
        log_btn.setBackground(new Color(-16));
        log_btn.setForeground(new Color(-16777216));
//        log_btn.add(ActionListener)
        mainPanel.add(log_btn);
        Border padd = BorderFactory.createEmptyBorder(20, 0, 0, 0);
        mainPanel.setVisible(true);
        mainPanel.setBorder(padd);

        bottomPanel.setBackground(new Color(-16));
        bottomPanel.setForeground(new Color(-16777216));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        reg_btn.setBackground(new Color(-16));
        reg_btn.setForeground(new Color(-16777216));
        repass_btn.setBackground(new Color(-16));
        repass_btn.setForeground(new Color(-16777216));
        reg_btn.setBorderPainted(false);
        repass_btn.setBorderPainted(false);
        bottomPanel.add(repass_btn);
        bottomPanel.add(reg_btn);
        ///form1.setVisible hình như vân ko display phải dùng 1 panel khác
        // làm trung gian giữa jframe frame và panel form1
        frame.setVisible(true);
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == log_btn) {
            String userID = username.getText();
            String pass = password.getText();

//            System.out.println("pass nhập: " + pass + "và " + logininfo.get(userID));
            if (logininfo.containsKey(userID)) {
                if (pass.equals(logininfo.get(userID))) {
//                System.out.println("pass nhập: " + pass + " và " + logininfo.get(userID) + "bằng nhau");
                    messagelabel.setForeground(Color.green);
                    messagelabel.setText("You got access!");
                    Main welcomePage = new Main();
                } else {
                    //ko có else là if trẹn ko dc chạy
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("Wrong password");
                }
            } else {
                messagelabel.setForeground(Color.red);
                messagelabel.setText("Username not found");
            }


        }
        if (e.getSource() == reg_btn) {
            username.setText("");
            password.setText("");
        }
    }
}