package Lv2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>(); // List 선언 및 초기화

        System.out.println("[ SHAKESHACK MENU ]");
        MenuItem menuitems = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItems.add(menuitems);
        menuItems.add(new MenuItem("SmokeShack", 8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        System.out.println("0. 종료          | 종료");
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입


        Scanner Menu = new Scanner(System.in);
        int MenuNumber;
        // Scanner 선언
        int i;
        for(i=0; i <= 3; i++){
            System.out.println(menuItems.get(i).MenuInformation());
        }

        do {
            MenuNumber = Menu.nextInt();// 숫자를 입력 받기
            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력

            if( MenuNumber == 1){
                System.out.println( menuItems.get(0).MenuInformation());
            }
            else if(MenuNumber == 2){
                System.out.println( menuItems.get(1).MenuInformation());
            }
            else if(MenuNumber == 3){
          