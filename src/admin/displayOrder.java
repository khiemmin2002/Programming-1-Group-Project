package admin;

import java.io. * ;
import java.util. *;


public class displayOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a customer's ID: ");
        String n = sc.nextLine();
        String line = "";
        String splitBy = ",";

        try {
            //parse CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("src/Orders.csv"));

            System.out.println("Order ID,Products,Ordered Date,Customer ID,Customer Name,Price,Status");

            while ((line = br.readLine()) != null)
            {
                //use comma as separator
                String[] product = line.split(splitBy);

                //if user enters an existing category, show all lines (products) with that category
                if (n.equals(product[3])) {
                    System.out.println(product[0] + "," + product[1] + "," + product[2] + "," + product[3] + "," + product[4] + "," + product[5] + "," + product[6]);
                }

            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
