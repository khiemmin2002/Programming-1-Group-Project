package admin;

import java.io. * ;
import java.util. *;

public class addProduct {
    public static void main(String[] args) {
        System.out.println("Please enter the following information to add a new product");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ID: ");
        String a = sc.nextLine();
        System.out.println("Please enter the name: ");
        String b = sc.nextLine();
        System.out.println("Please enter the price: ");
        int c = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Please enter the category ID: ");
        String d = sc.nextLine();
        System.out.println("Please enter the category name: ");
        String e = sc.nextLine();
        System.out.println("Please enter the amount available: ");
        int f = sc.nextInt();
        String y = sc.nextLine();
        System.out.println("Please enter the description: ");
        String g = sc.nextLine();
        System.out.println("Product added!");


        String id = a;
        String name = b;
        int price = c;
        String categoryID = d;
        String categoryName = e;
        int amount = f;
        String description = g;
        String filepath = "src/Products.csv";

        saveRecord(id,name,price,categoryID,categoryName,amount,description,filepath);

    }
    public static void saveRecord(String id,String name,int price,String categoryID,String categoryName,int amount,String description,String filepath) {
        try {
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(id + "," + name + "," + price + "," + categoryID + "," + categoryName + "," + amount + "," + description);
            pw.flush();
            pw.close();
        }
        catch (Exception e) {
        }
    }
}
