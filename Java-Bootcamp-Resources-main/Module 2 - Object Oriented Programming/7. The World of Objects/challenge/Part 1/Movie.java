public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }
}