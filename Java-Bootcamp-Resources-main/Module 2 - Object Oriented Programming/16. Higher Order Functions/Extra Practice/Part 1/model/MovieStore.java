package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {

    private List<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    public void addMovie (Movie movie){
        this.movies.add(movie);
    }

    public List<Movie> filterByGenre(String genre){
        return movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .toList();
    }

    public List<Movie> sortByReleaseYear(){
        return movies.stream()
                .sorted((x, y) -> Integer.compare(x.getReleaseYear(), y.getReleaseYear()))
                .toList();
    }

    public List<Movie> getTopRatedMovies(int n){
        return movies.stream()
                .sorted((x, y) -> Double.compare(y.getRating(), x.getRating()))
                .limit(n) // limits to a number of entries / movies
                .toList();
    }
}