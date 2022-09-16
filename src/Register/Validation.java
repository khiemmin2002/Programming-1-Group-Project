package Register;

import java.util.Scanner;
import java.lang.String;

public class Validation {
    private static String username;
    private static String password;
    private static String passConfirm;
    private static String phone;
    private static String email;
    private static String address;

    public static String checkUsername() {
        Scanner usernameInput = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = usernameInput.nextLine();
        String strPattern = "^[a-zA-Z0-9_.]{8,20}$";

        if (username.isEmpty()) {
            System.out.println("Please enter the necessary field:");
            username = usernameInput.nextLine();
            if (!username.matches(strPattern)) {
                System.out.println(username + " is not valid");
                System.out.println("Please enter again:");
                username = usernameInput.nextLine();

            } else {
                System.out.println(username + " is valid");
                setUsername(username);
            }
        }
        return username;
    }

    public String getUsername() {
        return username;
    }

    public static void setUsername(String newusername) {
        username = newusername;
    }

    public static String checkPassword() {
        Scanner passwordInput = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = passwordInput.nextLine();

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

        if (password != null) {
            // Prompting users if the password's length is less than 8 or more than 20 characters
            if (password.length() < 8 || password.length() > 20) {
                System.out.println("The password must be longer than 8 characters and not exceed 20 characters.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            } else
            // Prompting users if the password does not contain at least 1 digit
            if (!password.matches("(.*\\d.*)")) {
                System.out.println("The password must contain at least 1 digit.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            } else
            // Prompting users if the password does not contain a lowercase character
            if (!password.matches("(.*[a-z].*)")) {
                System.out.println("The password must contain at least a lowercase character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            } else
            // Prompting users if the password does not contain a lowercase character
            if (!password.matches("(.*[A-Z]).*")) {
                System.out.println("The password must contain at least an uppercase character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            } else
            // Prompting users if the password does not contain a special character
            if (!password.matches("(.*[^a-zA-Z\\d].*)")) {
                System.out.println("The password must contain at least a special character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();

            } else
            // Prompting users if the password contains a whitespace character
            if (!password.matches("(\\S+$)")) {
                System.out.println("The password do not contain any whitespace character.");
                System.out.println("Please enter again:");
                password = passwordInput.nextLine();
            } else {
                System.out.println(password + " is valid");
                setPassword(password);
                ConfirmPass(password);
            }} else {
            System.out.println("Please enter the necessary field:");
            password = passwordInput.nextLine();
        }
        return password;
    }

    public static void ConfirmPass(String password) {
        System.out.println("Enter the password again for confirmation:");
        Scanner input = new Scanner(System.in);
        passConfirm = input.nextLine();
        if (passConfirm.equals(password)) {
            System.out.println("Password Confirmation Valid");
        }
        System.out.println("Must match the previous entry");
        passConfirm = input.nextLine();
    }

    public String getPassword() {
        return password;
    }

    public static void setPassword(String newpassword) {
        password = newpassword;
    }

    public static String checkPhoneFormat() {
        Scanner phoneInput = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String phone = phoneInput.next();
//        System.out.print("Please enter your phone number: ");
//        String phoneInput = input.next();
//
//        if (phoneInput.matches("^\\d+$")) { // Kiểm tra sdt chỉ bao gồm số
//            String phoneFormat = phoneInput.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
//            System.out.println(phoneFormat);
//            break;
//        } else {
//            System.out.println("You can't enter non-digit value!"); // Nhắc ng dùng chỉ nhập số, ko có chữ
//        }

        /*
        CHECKING PHONE RULES
        It matches 10-digit numbers only as after entered the phone number, the data will auto stored in csv file in format.
        */

        /*if (phone.matches("^[0-9]{10}$")) {
            return validStatus;
        }*/

        if (phone != null) {
            if (!phone.matches("^[0-9]{10}$")) {
                    System.out.println("It must contains 10 numbers!");
                    System.out.println("Please enter again:");
                    phone = phoneInput.next();
                } else if (!phone.matches("^\\d+$")) { // Kiểm tra sdt chỉ bao gồm số
                    System.out.println("You can't enter non-digit value!");
                    System.out.println("Please enter again:");
                    phone = phoneInput.next();
                    // Nhắc ng dùng chỉ nhập số, ko có chữ
                } else {
                phone = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
                System.out.println(phone);
                System.out.println("Phone format is valid");
                setPhoneNumber(phone);
            }} else {
            System.out.println("Please enter the necessary field:");
            phone = phoneInput.next();
        }
        return phone;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public static void setPhoneNumber(String newphonenumber) {
        phone = newphonenumber;
    }

    public static String checkEmailFormat() {
        Scanner emailInput = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String email = emailInput.nextLine();

         /*
        CHECKING EMAIL RULES

        The following restrictions are imposed in the email address' local part by using this regex:

        It allows numeric values from 0 to 9.
        Both uppercase and lowercase letters from a to z are allowed.
        Underscore “_”, hyphen “-“, and dot “.” are allowed
        Dot isn't allowed at the start and end of the local part.
        Consecutive dots aren't allowed.
        For the local part, a maximum of 64 characters are allowed.
        Restrictions for the domain part in this regular expression include:

        It allows numeric values from 0 to 9.
        We allow both uppercase and lowercase letters from a to z.
        Hyphen “-” and dot “.” aren't allowed at the start and end of the domain part.
        No consecutive dots.

        So some of the email addresses that will be valid via this email validation technique are:
        username@domain.com
        user.name@domain.com
        user-name@domain.com
        username@domain.co.in
        user_name@domain.com

        Here's a shortlist of some email addresses that will be invalid via this email validation:
        username.@domain.com
        .user.name@domain.com
        user-name@domain.com.
        username@.com
        */

        String regexStr = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

        if (email != null) {
            if (!email.matches(regexStr)) {
                System.out.println(phone + " is not valid");
                System.out.println("It allows numeric values from 0 to 9.\n" +
                        "        Both uppercase and lowercase letters from a to z are allowed.\n" +
                        "        Underscore “_”, hyphen “-“, and dot “.” are allowed\n" +
                        "        Dot isn't allowed at the start and end of the local part.\n" +
                        "        Consecutive dots aren't allowed.");
                System.out.println("Please enter again:");
                email = emailInput.nextLine();
            }
                System.out.println(email + " is valid");
                setEmail(email);
            } else {
            System.out.println("Please enter the necessary field:");
            email = emailInput.nextLine();
        }
        return email;
    }

    public String getEmail() {
        return email;
    }

    public static void setEmail(String newemail) {
        email = newemail;
    }

    public static String checkAddress() {
        Scanner addressInput = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String address = addressInput.nextLine();

        /*
        CHECKING PHONE RULES
        It matches 10-digit numbers only as after entered the phone number, the data will auto stored in csv file in format.
        */

        /*if (phone.matches("^[0-9]{10}$")) {
            return validStatus;
        }*/


        if (address.isEmpty()) {
            System.out.println("Please enter the necessary field:");
            address = addressInput.nextLine();

        } else {
            System.out.println(address + " is valid");
            setAddress(address);
        }
        return address;
    }

    public String getAddress() {
        return address;
    }

    public static void setAddress(String newaddress) {
        address = newaddress;
    }

}
