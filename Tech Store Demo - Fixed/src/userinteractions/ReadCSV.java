package userinteractions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    List<Product> productList = new ArrayList<>();
    public ReadCSV() {
        String productFilePath = "Products.csv";
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(productFilePath));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Product product = new Product(values[0].replace("\u0000", "").trim().replaceAll("\\p{C}", ""), values[1], Double.parseDouble(values[2]), values[3], values[4], Integer.parseInt(values[5]), values[6]);
                productList.add(product);
                Product.convertVietnameseCurrency(Double.parseDouble(values[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayAllProduct() {
        for (Product p: productList) {
            System.out.println(p.toString());
        }
    }
}
