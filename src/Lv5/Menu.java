package Lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> menuItems;

    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    // Getter and Setter 메서드를 사용
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public String MenuInformation() {
        StringBuilder excute = new StringBuilder( category );
        for (MenuItem item : menuItems) {
            excute.append(item.MenuInformation()).append("\n");
        }
        return excute.toString();
    }
}