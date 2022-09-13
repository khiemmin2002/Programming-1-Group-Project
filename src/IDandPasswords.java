import java.util.HashMap;

public class IDandPasswords {
    static HashMap <String, String> loginInfo = new HashMap <String, String>();

    public IDandPasswords() {
        loginInfo.put("admin", "123456");
        loginInfo.put("admin1", "1234567");
        loginInfo.put("admin2", "12345678");
    }

    protected static HashMap getLoginInfo() {

        return loginInfo;

    }
//    public static void main (String[] args) {
//        IDandPasswords j = new IDandPasswords();
//        j.getLoginInfo();
//        System.out.println("Initial Mappings are: " + loginInfo.get("admin"));
//    }

}
