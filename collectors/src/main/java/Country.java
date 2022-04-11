public class Country {
    private String name;
    private String capital;
    private int size;

    public Country(String name, String capital, int size) {
        this.name = name;
        this.capital = capital;
        this.size = size;
    }

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getSize() {return size; };

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
