import java.sql.Connection;
import java.sql.DriverManager;

import static javax.swing.BorderFactory.createEmptyBorder;

public class UserInfo {
    public String username;
    public String password;
    public String passwordConfirm;
    public String email;
    public String phone;
    public String address;

    /// ko cần thêm 1 constructor đề save data vì data này lấy từ bên RegisterPage luôn => nhập vào là save vào luôn

    protected static UserInfo AddUserInfo() {
        UserInfo new_user = null;

        return new_user;
    }
    }

