package Lv5;

public class MenuItem {
    private String name;
    private double price;
    private String explain;

    // 생성자
    public MenuItem(String name, double price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    // 메뉴 정보 반환
    public String MenuInformation() {
        return name  + price  + explain;
    }
}