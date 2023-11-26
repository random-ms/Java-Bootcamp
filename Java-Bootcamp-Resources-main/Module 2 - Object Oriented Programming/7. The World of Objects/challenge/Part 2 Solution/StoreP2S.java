public class StoreP2S {

    private MovieP2S[] movies;

    public StoreP2S() {
        this.movies = new MovieP2S[10];
    }

    public MovieP2S getMovie(int index) {
        return new MovieP2S(this.movies[index]);
    }

    public void setMovie(int index, MovieP2S movie) {
        this.movies[index] = new MovieP2S(movie);
    }

    public String toString() {
        String temp = "";
        for (MovieP2S movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
