package order;

import userinteractions.ShoppingCart;

import java.util.ArrayList;

public abstract class Order {
    private String orderID;
    private ArrayList<ShoppingCart> realCart;

    protected Membership membership;

    public Order() {
    }

    public Order(String orderID, ArrayList<ShoppingCart> realCart) {
        this.orderID = orderID;
        this.realCart = realCart;
    }

    public abstract void placeOrder();


}
