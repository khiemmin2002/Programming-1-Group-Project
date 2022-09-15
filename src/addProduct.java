import java.io. * ;
import java.util. *;

public class addProduct {
    public static void main(String[] args) {
        System.out.println("Please enter the following information to add a new product");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ID: ");
        String a = sc.nextLine();
        System.out.println("Please enter the title: ");
        String b = sc.nextLine();
        System.out.println("Please enter the price: ");
        double c = sc.nextDouble();
        String d = sc.nextLine();
        System.out.println("Please enter the category: ");
        String e = sc.nextLine();
        System.out.println("Product added!");


        String ID = a;
        String Title = b;
        double Price = c;
        String Category = e;
        String filepath = "src/Product.csv";

        saveRecord(ID,Title,Price,Category,filepath);

    }
    public static void saveRecord(String ID,String Title,double Price,String Category,String filepath) {
        try {
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ID + "," + Title + "," + Price + "," + Category);
            pw.flush();
            pw.close();
        }
        catch (Exception e) {
        }
    }
}
