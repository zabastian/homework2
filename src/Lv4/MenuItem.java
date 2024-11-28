package Lv4;

public class MenuItem {
    String name;
    double price;
    String explain;

    MenuItem(String name, double price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
    }
    public String MenuInformation() {
        return name  + price + explain;
    }

    public String getName() {
        return name;
    }
}