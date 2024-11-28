package Lv4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<Menu> menus; // 변경된 변수 이름

    public Kiosk() {
        this.menus = new ArrayList<>();


        // 메뉴 카테고리 생성 및 항목 추가
        Menu burgerMenu = new Menu("버거");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Menu drinkMenu = new Menu("음료");



        menus.add(burgerMenu);
        menus.add(drinkMenu);
    }


    // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean excute = true;

        while (excute) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료          | 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menuNumber = scanner.nextInt();

            if (menuNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                excute = false; // 프로그램 종료
            } else if (menuNumber >= 1 && menuNumber <= menus.size()) {
                // 선택한 메뉴 정보 출력
                SecondMenu(menus.get(menuNumber - 1), scanner);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void SecondMenu(Menu menu, Scanner scanner) {
        while (true) {

            System.out.println("\n[ " + menu.getCategoryName() + " 메뉴 ]");
            List<MenuItem> items = menu.getMenuItems();
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i).MenuInformation());
            }
            System.out.println("0. 뒤로가기");
            System.out.print("선택하세요: ");

            int input = scanner.nextInt();

            if (input == 0) {
                break; // 뒤로가기
            } else if (input >= 1 && input <= items.size()) {
                System.out.println("\n선택한 항목: " + items.get(input - 1).MenuInformation());
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}