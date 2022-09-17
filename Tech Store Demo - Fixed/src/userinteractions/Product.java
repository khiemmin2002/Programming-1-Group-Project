package userinteractions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class Product {
    private String productID;
    private String productName;
    private double productPrice;
    private String categoryID;
    private String categoryName;
    private int productQuantity;
    private String productDescription;

    public Product() {
    }

    public Product(String productID, String productName, double productPrice, int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public Product(String productID, String productName, double productPrice, String categoryID, String categoryName, int productQuantity, String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.productQuantity = productQuantity;
        this.productDescription = productDescription;
    }

    // This constructor for the Shopping Cart
    public Product(String productID, String productName, int productQuantity, double productPrice) {
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return  "\nProduct ID:  " + productID + '\n' +
                "Product Name: " + productName + '\n' +
                "Product Price: " + convertVietnameseCurrency(productPrice) + '\n' +
                "Category ID: " + categoryID + '\n' +
                "Category Name: " + categoryName + '\n' +
                "Product Quantity: " + productQuantity + '\n' +
                "Product Description: " + productDescription;
    }

    public void purchaseInstruction() {
        System.out.println("Because it is only the console interface, the store could not provide fully functions like a real application.");
        System.out.println("If you want to add a product to the cart, please take note of the Product ID as well as the amount you would like for, then you can fill it down in the Shopping Cart");
        System.out.println("We are really sorry for this inconvenience! Thank you!");
    }

    public static String convertVietnameseCurrency(double productPrice) {
        Locale vietnam = new Locale("vn","VN");
        Currency currency = Currency.getInstance(vietnam);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(vietnam);
        return (numberFormat.format(productPrice) + " " + currency.getDisplayName());
    }
}