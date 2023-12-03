public class Main2 {

    public static void main(String[] args) {

    Car2 nissan = new Car2("Nissan", 10000, 2020, "Green");

    Car2 dodge = new Car2("Dodge", 11000, 2019, "Blue");

    Car2 nissan2 = new Car2(nissan);

    nissan2.setColor("Orange");

    nissan.setPrice(nissan.getPrice() * 0.8); // 20% discount
    dodge.setPrice(dodge.getPrice() * 0.7); // 30% discount

    System.out.println(nissan.getPrice());
    System.out.println(dodge.getPrice());
    System.out.println(nissan.getColor());
    System.out.println(nissan2.getColor());
    }
    
}
