package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem> menuItems;

    public Menu(String category) {
        this.menuItems = new ArrayList<>();
        this.category = category;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem); // 새로운 메뉴 항목을 menuItems 리스트에 추가
    }

    public String getCategoryName() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
