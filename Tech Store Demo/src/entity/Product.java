package entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productID;
    private String productName;
    private long productPrice;
    private String categoryID;
    private String categoryName;
    private int productAmount;
    private String productDescription;

    public Product() {
    }

    public Product(String productID, String productName, long productPrice, String categoryID, String categoryName, int productAmount, String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.productAmount = productAmount;
        this.productDescription = productDescription;
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

    public long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(long productPrice) {
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

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
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
                "Product Price: " + productPrice + '\n' +
                "Category ID: " + categoryID + '\n' +
                "Category Name: " + categoryName + '\n' +
                "Product Amount: " + productAmount + '\n' +
                "Product Description: " + productDescription;
    }

    public void readProductFromFile() {
        String productFilePath = "Products.csv";
        String line;
        List<Product> productList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(productFilePath));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Product product = new Product(values[0], values[1], Long.parseLong(values[2]), values[3], values[4], Integer.parseInt(values[5]), values[6]);
                productList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Product p: productList) {
            System.out.println(p.toString());
        }
    }

    public void purchaseInstruction() {
        System.out.println("Because it is only the console interface, the store could not provide fully functions like a real application.");
        System.out.println("If you want to add a product to the cart, please take note of the Product ID as well as the amount you would like for, then you can fill it down in the Shopping Cart");
        System.out.println("We are really sorry for this inconvenience! Thank you!");
    }
}
