public class Store {

    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies[index]); /*New reference to prevent internal state from being external modification. */
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie); /*New reference to prevent internal state from being external modification. */
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}