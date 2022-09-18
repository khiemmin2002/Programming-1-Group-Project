package loginGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import static javax.swing.BorderFactory.createEmptyBorder;

public class UserInfo {
    public String username;
    public String password;
    public String passwordConfirm;
    public String email;
    public String phone;
    public String address;

    /// ko cần thêm 1 constructor đề save data vì data này lấy từ bên RegisterGUI.RegisterPage luôn => nhập vào là save vào luôn

    public UserInfo AddUserInfo(String name, String email, String phone, String address, String password) {
        UserInfo newuser = new UserInfo();
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String dbName = "demo";
        String driver = "com.mysql.jdbc.Driver";
        String userName_db = "root";
        String passWord_db = "0925747216aefgH@";
        try {
//            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, userName_db, passWord_db);
            // Connected to database successfully...
            System.out.println("Successfully connected");

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users (username, email, phone, address, password) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password);

            //Insert row into the table
            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                newuser = new UserInfo();
                newuser.username = name;
                newuser.email = email;
                newuser.phone = phone;
                newuser.address = address;
                newuser.password = password;
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newuser;
    }

    }

