import product.Pants;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();

        shirt.setSize(Size.MEDIUM);
        shirt.setBrand("Nike");
        shirt.setPrice(49.99);
        shirt.setColor("Blue");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(35);
        pants.setLength(0);
        pants.setColor("Green");
        pants.setBrand("PUMA");
        pants.setPrice(35.99);
        pants.fold();
    }
}
