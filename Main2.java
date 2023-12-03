public class Main2 {

    public static void main(String[] args) {

    Car2 nissan = new Car2("Nissan", 10000, 2020, "Green");

    Car2 dodge = new Car2("Dodge", 11000, 2019, "Blue");

    nissan.setPrice(nissan.getPrice() * 0.8); // 20% discount
    dodge.setPrice(dodge.getPrice() * 0.7); // 30% discount

    System.out.println(nissan.getPrice());
    }
    
}
