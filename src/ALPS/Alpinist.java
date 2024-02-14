package ALPS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Alpinist {
    private String name;
    private int age;
    private String adres;

    public Alpinist(String name, int age, String adres) {
        this.name = name;
        this.age = age;
        this.adres = adres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}