public class MovieP2S {

    private String name;
    private String format;
    private double rating;

    public MovieP2S(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }    


    public MovieP2S(MovieP2S source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }
    

}
