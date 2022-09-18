package loginGUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import static javax.swing.BorderFactory.createEmptyBorder;

public class Test extends JFrame {
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
    public Test() {
        setupGUI()
        ;    }

    private void setupGUI() {
        frame = new JFrame();
        ///ko dc quên tạo parameters/ args ở đây nếu ko sẽ ko dùng dc public giữa các methods
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(4,1));
        frame.setTitle("login");
        ///lấy content pane là pane chính là frame còn mấy cái panel nằm trong
        //frame đó vẫn phải thêm code edit riêng
        frame.getContentPane().setBackground(new Color(-16));
        loginlabel = new JLabel("login", JLabel.CENTER);
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
        ///Phải tạo trc r ms ms dc apply mấy cái edit vào method
        //frame phải add theo thứ tự
        //loginlabel xong controlPanel trc xong log_btn thì cái frame sẽ display theo thứ tự
        bottomPanel = new JPanel();
        repass_btn = new JButton("Forgot password?");
        repass_btn.setFont(new Font("Didot", Font.PLAIN, 14));
        repass_btn.setMargin(new Insets(10, 10, 10, 10));
        reg_btn = new JButton("register");
        reg_btn.setFont(new Font("Didot", Font.PLAIN, 14));
        reg_btn.setMargin(new Insets(10, 10, 10, 10));
        frame.add(loginlabel);
        frame.add(controlPanel);
        frame.add(mainPanel);
        frame.add(bottomPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showGridLayout() {
        controlPanel.setBackground(new Color(-16));
        controlPanel.setSize(400, 400);
        controlPanel.setForeground(new Color(-16777216));
        controlPanel.setLayout(new GridLayout(2,2,10,10));
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
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
//        Border padds = BorderFactory.createEmptyBorder(0, 10, 30, 10);
//        bottomPanel.setBorder(padds);
        reg_btn.setBackground(new Color(-16));
        reg_btn.setForeground(new Color(-16777216));
        repass_btn.setBackground(new Color(-16));
        repass_btn.setForeground(new Color(-16777216));
        reg_btn.setBorderPainted(false);
        repass_btn.setBorderPainted(false);
        bottomPanel.add(repass_btn);
        bottomPanel.add(reg_btn);
//        form1.add(username);
//        form1.add(password);
        ///form1.setVisible hình như vân ko display phải dùng 1 panel khác
        // làm trung gian giữa jframe frame và panel form1
        frame.setVisible(true);
    }
    public static void main(String args[]) {
//        Test f = new Test();
//        //nên tạo 1 constructor để tạo layout cơ bản trc
//        //sau đó mấy cái màu mè tô điểm margin thì tạo methods
//        f.showGridLayout();
//        UserInfo testConnection = new UserInfo();
//        UserInfo.AddUserInfo();
    }



}