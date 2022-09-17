package order;

import userinteractions.ShoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class NormalOrder extends Order {

    @Override
    public void placeOrder() {
        String orderID = setOrderID();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please review your order");

        System.out.println("Product name: iPhone 14 128GB Blue");
        System.out.println("Quantity: 2");

        System.out.println("Product name: iPhone 14 Pro Max 128GB Deep Purple");
        System.out.println("Quantity: 3");

        System.out.println("Total: 120,950,000 VND");

        System.out.println("Please confirm your order(Y)");

        String confirm = scanner.nextLine().toLowerCase();
        if (confirm.equals("y")) {
            System.out.println("Congratulations! Your order has been created");
            System.out.println(orderID);
        } else {
            System.out.println("Cannot created order!");
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

    public static void main(String[] args) {

    }
}
