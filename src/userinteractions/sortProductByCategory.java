package userinteractions;

import java.io. * ;
import java.util. *;

// feature 4: search for all available products for a particular category

public class sortProductByCategory {
    public static void sortProductByCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a category name: ");
        String n = sc.nextLine();
        String line = "";
        String splitBy = ",";

        try {
            //parse CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("Products.csv"));

            System.out.println("ProductID, ProductName, ProductPrice, Category ID, Category Name, ProductQuantity, Description");

            while ((line = br.readLine()) != null)
            {
                //use comma as separator
                String[] product = line.split(splitBy);

                //if user enters an existing category, show all lines (products) with that category
                if (n.equals(product[4])) {
                    System.out.println(product[0] + ", " + product[1] + ", " + product[2] + ", " + product[3] + ", " + product[4] + ", " + product[5] + ", " + product[6]);
                }

            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
