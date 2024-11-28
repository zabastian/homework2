package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<MenuItem> menuItems;

    public Kiosk() {
        this.menuItems = new ArrayList<>();
        System.out.println("[ SHAKESHACK MENU ]");
        MenuItem menuItem = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItems.add(menuItem);
        menuItems.add(new MenuItem("SmokeShack", 8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        System.out.println("0. 종료          | 종료");
    }


    // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean excute = true;

        while (excute) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).MenuInformation());
            }
            System.out.println("0. 종료          | 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menuNumber = scanner.nextInt();

            if (menuNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                excute = false; // 프로그램 종료
            } else if (menuNumber >= 1 && menuNumber <= menuItems.size()) {
                // 메뉴 재 출력
                SecondMenu(menuNumber, scanner);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void SecondMenu(int menuNumber, Scanner scanner) {
        while (true) {
            System.out.println("\n" + menuItems.get(menuNumber - 1).MenuInformation());
            System.out.println("0. 뒤로가기");
            System.out.print("선택하세요: ");

            int input = scanner.nextInt();

            if (input == 0) {
                break; // 뒤로가기
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
//        do {
//            MenuNumber = Menu.nextInt();// 숫자를 입력 받기
//            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
//
//            if (MenuNumber == 1) {
//                System.out.println(menus.get(0).MenuInformation());
//            } else if (MenuNumber == 2) {
//                System.out.println(menuItems.get(1).MenuInformation());
//            } else if (MenuNumber == 3) {
//                System.out.println(menuItems.get(2).MenuInformation());
//            } else if (MenuNumber == 4) {
//                System.out.println(menuItems.get(3).MenuInformation());
//            } else if (MenuNumber == 0) {
//                System.out.println("0. 종료          | 종료");
//            }
//        } while (MenuNumber != 0);// 입력된 숫자에 따른 처리
//
//        System.out.println("프로그램을 종료합니다.");// 프로그램을 종료
    }



