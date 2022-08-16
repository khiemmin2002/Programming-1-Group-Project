import java.io. * ;
import java.util. *;

// feature 4: search for all available products for a particular category
public class CategorySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a category: ");
        String n = sc.nextLine();
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

                //if user enters an existing category, show all lines (products) with that category
                if (n.equals(product[0])) {
                    System.out.println(product[0] + "," + product[1] + "," + product[2] + "," + product[3]);
                }

            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
