public class Welcome {

    public void welcomeScreen() {
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

        // Match the Student ID with the appropriate Student Name
        for (int i = 0; i < studentID.length; i++) {
            for (int j = 0; j < studentID.length; j++) {
                if (i==j) {
                    System.out.printf("%s - %s%n", studentID[i], studentName[j]);
                }
            }
        }

        // Greet when start the program
        String greeting = "Welcome to the Penguin electronic store";
        System.out.println("\n" + greeting);
    }
}
