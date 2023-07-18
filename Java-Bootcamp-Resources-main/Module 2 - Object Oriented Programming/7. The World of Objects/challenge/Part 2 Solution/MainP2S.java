public class MainP2S {

    static StoreP2S store = new StoreP2S();

    public static void main(String[] args) {

        MovieP2S[] movies = new MovieP2S[] {
            new MovieP2S("The Shawshank Redemption", "BlueRay", 9.2),
            new MovieP2S("The Godfather", "BlueRay", 9.1),
            new MovieP2S("The Godfather: Part II", "DVD", 9.0),
            new MovieP2S("12 Angry Men", "DVD", 8.9),
            new MovieP2S("The Dark Knight", "BlueRay", 9.0),
            new MovieP2S("Schindler's List", "DVD", 8.9),
            new MovieP2S("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new MovieP2S("Pulp Fiction", "DVD", 8.8),
            new MovieP2S("The Good, the Bad and the Ugly", "DVD", 8.8),
            new MovieP2S("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();


    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }


}
