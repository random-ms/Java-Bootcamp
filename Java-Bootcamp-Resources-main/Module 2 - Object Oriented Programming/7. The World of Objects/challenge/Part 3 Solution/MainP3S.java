import java.util.Scanner;

public class Main {

    static StorePS3 store = new StorePS3();

    public static void main(String[] args) {
        MovieP3S[] movies = new MovieP3S[] {
            new MovieP3S("The Shawshank Redemption", "BlueRay", 9.2),
            new MovieP3S("The Godfather", "BlueRay", 9.1),
            new MovieP3S("The Godfather: Part II", "DVD", 9.0),
            new MovieP3S("12 Angry Men", "DVD", 8.9),
            new MovieP3S("The Dark Knight", "BlueRay", 9.0),
            new MovieP3S("Schindler's List", "DVD", 8.9),
            new MovieP3S("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new MovieP3S("Pulp Fiction", "DVD", 8.8),
            new MovieP3S("The Good, the Bad and the Ugly", "DVD", 8.8),
            new MovieP3S("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();
        userInput();

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        String status = "continue";
        while (status.equals("continue")) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice = scanner.nextInt();
            MovieP3S movie = store.getMovie(choice);
            System.out.print("Set a new rating for " + movie.getName() + ": ");
            double rating = scanner.nextDouble();
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
