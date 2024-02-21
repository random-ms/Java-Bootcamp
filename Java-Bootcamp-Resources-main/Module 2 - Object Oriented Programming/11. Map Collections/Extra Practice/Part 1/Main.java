public class Main {
    public static void main(String[] args) {

        City city1 = new City("New York", "USA", 8500000);
        System.out.println(city1.getName());

        // Uncomment to test invalid input for setName, setCountry, setCountry & input for the constructor
        city1.setName("Zoo York");
        city1.setCountry("Zoo");
        city1.setPopulation(10000);
        City city2 = new City("", "USA", 8500000);

    
    }
}