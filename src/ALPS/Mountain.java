package ALPS;

public class Mountain {
    private String name;
    private String Country;
    private int high;

    public Mountain(String name, String country, int high) {
        this.name = name;
        Country = country;
        this.high = high;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
