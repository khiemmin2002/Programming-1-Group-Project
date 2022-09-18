package loginGUI;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

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
///C001-****
    public static String IDgenerate() {
        int count = 0;
        int[] array = new int[9999];

        String ID = new String();
        for (int i = 0; i < 2; i++) {
            count++;
            int first = count;
            int second_part = (int) (Math.random() * 9999);
            ID = "C"+ "00"+ first + "-" + second_part;
            System.out.println(ID);
            System.out.println(createID());
        }
        return ID;
    }
    private static AtomicLong idCounter = new AtomicLong();

    public static String createID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }
    public static void main (String[] args) {
        IDgenerate();
        String uniqueID = UUID.randomUUID().toString();
        System.out.println(createID());
    }

}
