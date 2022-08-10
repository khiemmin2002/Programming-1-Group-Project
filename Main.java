package home;

import static home.Menu.displayMenu;

public class Main {

    public static void main(String[] args) {
        welcomeScreen();
    }

    public static void welcomeScreen() {
        String asmInfo;
        String projectName;
        String instructorName;
        String groupName;

        asmInfo = "COSC2081 GROUP ASSIGNMENT";
        projectName = "STORE ORDER MANAGEMENT SYSTEM";
        instructorName = "Mr. Minh Vu";
        groupName = "Chiến Thần OOP";

        String[] studentID = {"s3818552", "s3878280", "s3932146", "s3926829"};
        String[] studentName = {"Nguyễn Hà Kiều Anh", "Mìn Chi Gia Khiêm", "Lê Khánh Toàn", "Ngô Minh Hoàng"};

        System.out.print(asmInfo + '\n' + projectName + '\n' + "Instructor: " + instructorName + '\n' + "Group: " + groupName + '\n');

        for (int i = 0; i < studentID.length; i++) {
            System.out.println(studentID[i]);
            for (int j = 0; j < studentID.length; j++) {
                System.out.print(studentName[j]);
            }
        }
    }
}

