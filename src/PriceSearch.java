import java.io. * ;
import java.util. *;

// feature 5: sort all products by product price
public class PriceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the minimum price: ");
        String m = sc.next();
        System.out.println("Please enter the maximum price: ");
        String p = sc.next();
        String line = "";
        String splitBy = ",";
        try {
            //parse CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("src/product.csv"));
            System.out.println("CATEGORY,PRODUCT ID,PRODUCT NAME,PRICE");

            while ((line = br.readLine()) != null)
            {
                //use comma as separator
                String[] product = line.split(splitBy);

                //if user enters a price range, show all lines (products) with price that is in that range
                if (Integer.parseInt(m) <= Integer.parseInt(product[3]) && Integer.parseInt(p) >= Integer.parseInt(product[3])) {
                    System.out.println(product[0] + "," + product[1] + "," + product[2] + "," + product[3]);
                }

            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}

