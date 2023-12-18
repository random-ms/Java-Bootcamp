public class Main {

    public static void main(String[] args) {
        
    Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[]{"Tires", "Keys"});

    Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[]{"Tires", "Keys"});

    Car nissan2 = new Car(nissan);

    nissan.setColor("Orange");

    nissan.setPrice(nissan.getPrice() * 0.8); // 20% discount
    dodge.setPrice(dodge.getPrice() * 0.7); // 30% discount

    /* System.out.println(nissan.getPrice());
    System.out.println(dodge.getPrice());
    System.out.println(nissan.getColor());
    System.out.println(nissan2.getColor());
    */
    System.out.println(nissan);
    }
}
