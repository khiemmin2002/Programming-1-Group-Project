package userinteractions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();
    private int itemCount = 0;      // total number of items in the cart
    private double totalPrice = 0.0;  // total price of items in the cart

    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart() {
    }

    public String toString()
    {
        Locale vietnam = new Locale("vn","VN");
        Currency currency = Currency.getInstance(vietnam);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(vietnam);

        String contents = "\nShopping Cart\n";

        for (Product p: cart
             ) {
            contents += p.toString() + "\n";
        }

        contents += "\nTotal Price: " + numberFormat.format(totalPrice) + " " + currency.getDisplayName();
        contents += "\n";

        return contents;
    }

    public void addItems() {
        String productID;
        int productQuantity;

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";
        ShoppingCart myCart = new ShoppingCart();

        while (true) {

            System.out.print("Enter the ID of the product: ");
            productID = scan.next();
            scan.nextLine();

            System.out.print ("Enter the quantity: ");
            productQuantity = Integer.parseInt(scan.nextLine());

            // *** create a new item and add it to the cart
            myCart.addToCart(productID, productQuantity);


            // *** print the contents of the cart object using println
            System.out.println(myCart);

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
            if (keepShopping.equals("n")) {
                break;
            }
        }
    }

    private void addToCart(String productID, int productQuantity) {
        ReadCSV data = new ReadCSV();
        try {
            Product product= data.productList.stream().filter(a -> a.getProductID().trim().equals(productID.trim())).toList().get(0);
            System.out.println(product.toString());
            if (product!=null) {
                for (int i = 0; i < productQuantity; i++) {
                    this.cart.add(product);
                    this.itemCount += 1;
                    this.totalPrice += product.getProductPrice();
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Item not found");
        }
    }

}
