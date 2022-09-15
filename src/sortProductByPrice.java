import java.io. * ;
import java.util. *;

// feature 5: sort all products by product price
public class sortProductByPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the minimum price: ");
        float m = sc.nextFloat();
        System.out.println("Please enter the maximum price: ");
        float p = sc.nextFloat();
        String line = "";
        String splitBy = ",";
        try {
            //parse CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("src/Product.csv"));
            System.out.println("ID,Title,Price,Category");

            while ((line = br.readLine()) != null)
            {
                //use comma as separator
                String[] product = line.split(splitBy);
                try {
                    //if user enters a price range, show all lines (products) with price that is in that range
                    if (m <= Float.parseFloat(product[2]) && p >= Float.parseFloat(product[2])) {
                        System.out.println(product[0] + "," + product[1] + "," + product[2] + "," + product[3]);
                    }
                } catch (Exception e) {
                    continue;
                }

            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
