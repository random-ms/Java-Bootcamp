public class City {
    private String name;
    private String country;
    private long population;


    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null or Blank.");
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if(country == null || country.isBlank()) throw new IllegalArgumentException("Country cannot be null or Blank.");
        this.country = country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        if(population <= 0) throw new IllegalArgumentException("Population must be greater than 0.");
        this.population = population;
    }


}
