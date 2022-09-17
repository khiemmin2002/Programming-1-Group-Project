package LoginGUI;

import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class Login extends JFrame {
    private JPanel form1;
    private JTextField username;
    private JTextField password;
    private JButton log_btn;
    private JLabel userlabel;
    private JLabel passlabel;
    private JLabel loginlabel;
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;



    public void setupGUI() {

        JFrame frame = new JFrame();
        frame.setSize(600, 800);
        frame.setLayout(new GridLayout(5, 7));
        frame.setTitle("Login");
        frame.add(form1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public void showGridLayout() {

        GridBagConstraints lout = new GridBagConstraints();
        form1 = new JPanel();
        form1.setLayout(new GridBagLayout());
        form1.setBackground(new Color(-16));
        form1.setEnabled(false);
        form1.setForeground(new Color(-16));

        password = new JTextField();
        username = new JTextField();

        if (shouldFill) {
            lout.fill = GridBagConstraints.HORIZONTAL;
        }
        loginlabel = new JLabel("Login", JLabel.CENTER);
        loginlabel.setBackground(new Color(-16));
        loginlabel.setForeground(new Color(-16777216));
        if (shouldWeightX) {
            lout.weightx = 0.5;
        }
        lout.gridx = 3;
        lout.gridy = 0;
        form1.add(loginlabel);




        userlabel = new JLabel("Username", JLabel.CENTER);
        userlabel.setBackground(new Color(-16));
        userlabel.setForeground(new Color(-16777216));


        passlabel = new JLabel("Password", JLabel.CENTER);
        passlabel.setBackground(new Color(-16));
        passlabel.setForeground(new Color(-16777216));

        log_btn = new JButton("Login");

        form1.add(username);
        form1.add(password);
        form1.add(userlabel);
        form1.add(passlabel);
        form1.add(log_btn);
        form1.setVisible(true);

    }
    public static void main(String args[]) {
        Login f = new Login();
        f.showGridLayout();
    }

}

//import java.awt.Button;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//
//import javax.swing.*;
//public class Test extends JFrame{
//    public static void main(String[] args) {
//        Test a = new Test();
//    }
//    public Test() {
//        GridBagLayout grid = new GridBagLayout();
//        GridBagConstraints gbc = new GridBagConstraints();
//        setLayout(grid);
//        setTitle("GridBag Layout Example");
//        GridBagLayout layout = new GridBagLayout();
//        this.setLayout(layout);
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        this.add(new JLabel("Button One"), gbc);
//        gbc.gridx = 1;
//        gbc.gridy = 0;
//        this.add(new Button("Button two"), gbc);
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.ipady = 20;
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        this.add(new Button("Button Three"), gbc);
//        gbc.gridx = 1;
//        gbc.gridy = 1;
//        this.add(new Button("Button Four"), gbc);
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridwidth = 2;
//        this.add(new Button("Button Five"), gbc);
//        setSize(300, 300);
//        setPreferredSize(getSize());
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//    }
//
//}