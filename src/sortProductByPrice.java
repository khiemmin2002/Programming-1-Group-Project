import java.io. * ;
import java.util. *;

// feature 5: sort all products by product price
public class sortProductByPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the minimum price: ");
        int m = sc.nextInt();
        System.out.println("Please enter the maximum price: ");
        int p = sc.nextInt();
        String line = "";
        String splitBy = ",";
        try {
            //parse CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("src/Products.csv"));
            System.out.println("ID,Name,Price,Category ID,Category Name,Amount,Description");

            while ((line = br.readLine()) != null)
            {
                //use comma as separator
                String[] product = line.split(splitBy);
                try {
                    //if user enters a price range, show all lines (products) with price that is in that range
                    if (m <= Integer.parseInt(product[2]) && p >= Integer.parseInt(product[2])) {
                        System.out.println(product[0] + "," + product[1] + "," + product[2] + "," + product[3] + "," + product[4] + "," + product[5] + "," + product[6]);
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
