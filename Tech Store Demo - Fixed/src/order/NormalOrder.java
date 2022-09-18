package order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class NormalOrder extends Order {

    @Override
    public void placeOrder() {
        Scanner orderInput = new Scanner(System.in);

        System.out.println("Do you want to place an order? (Y/N)");
        String confirmation = orderInput.nextLine().toLowerCase();

        if (confirmation.equals("y")) {
            String orderID = setOrderID();
            String items = "iPhone 14 + Airpods Pro";
            String date = "17 September 2022 - 14:56 PM";
            String customerID = "C023";
            String customerName = "Nicolo Zaniolo";
            String orderStatus = "WAITING";
            try {
                FileWriter fwOrder = new FileWriter("Orders.csv", true);
                BufferedWriter bwOrder = new BufferedWriter(fwOrder);
                PrintWriter pwOrder = new PrintWriter(bwOrder);
                StringBuilder sbOrder = new StringBuilder();

                sbOrder.append(orderID);
                sbOrder.append(',');
                sbOrder.append(items);
                sbOrder.append(',');
                sbOrder.append(date);
                sbOrder.append(',');
                sbOrder.append(customerID);
                sbOrder.append(',');
                sbOrder.append(customerName);
                sbOrder.append(',');
                sbOrder.append("27990000");
                sbOrder.append(',');
                sbOrder.append(orderStatus);
                sbOrder.append("\r\n");

                pwOrder.write(sbOrder.toString());
                pwOrder.close();

            } catch (Exception e) {
                //Something
            }
        } else {
            System.out.println("Failed to make an order!");
        }
    }

    public String setOrderID() {
        Random random = new Random();
        String orderIDNotation = "O";
        int minValueForCode = 1000;
        int maxValueForCode = 9999;
        int orderCode;

        orderCode = minValueForCode + random.nextInt(maxValueForCode);

        return orderIDNotation + orderCode;
    }

}
