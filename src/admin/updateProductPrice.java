package admin;

import java.io.*;
import java.util.*;

public class updateProductPrice {
    public static void main(String[] args) {
        String filepath = "src/Products.csv";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ID of the product you want to update price: ");
        String newId = sc.nextLine();

        System.out.println("Please enter the new price: ");
        int newPrice = sc.nextInt();

        updatePrice(filepath,newId,newPrice);
    }

    public static void updatePrice(String filepath,String newId,int newPrice) {
        String tempFile = "src/temp.csv";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String id = "";
        String name = "";
        int price = 0;
        String categoryId = "";
        String categoryName = "";
        int amount = 0;
        String description = "";

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                id = x.next();
                name = x.next();
                price = x.nextInt();
                categoryId = x.next();
                categoryName = x.next();
                amount = x.nextInt();
                description = x.next();

                if (id.equals(newId)) {
                    pw.println(newId + "," + name + "," + newPrice + "," + categoryId + "," + categoryName + "," + amount + "," + description + "\n");
                } else {
                    pw.println(newId + "," + name + "," + price + "," + categoryId + "," + categoryName + "," + amount + "," + description + "\n");
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);


        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
