import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(20, "PURPLE", "Adidas", Size.SMALL);
        shirt.fold();
        storeHub(shirt);

        Pants pants = new Pants(30.00,"GOLD", "Nike", 21, 21);
        pants.fold();
        storeHub(pants);
    }

    public static void storeHub(Product product){
        System.out.println("Thank you for buying " + product.getBrand());
    }
}