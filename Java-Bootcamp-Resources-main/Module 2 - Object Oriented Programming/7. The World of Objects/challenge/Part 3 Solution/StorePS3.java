public class StorePS3 {

    private MovieP3S[] movies;

    public StorePS3() {
        this.movies = new MovieP3S[10];
    }

    public MovieP3S getMovie(int index) {
        return new MovieP3S(this.movies[index]);
    }

    public void setMovie(int index, MovieP3S movie) {
        this.movies[index] = new MovieP3S(movie);
    }

    public String toString() {
        String temp = "";
        for (MovieP3S movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}