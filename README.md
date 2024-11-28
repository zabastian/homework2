
-기술 스택
Java 11 이상
리스트 관리 (ArrayList)
사용자 입력 처리 (Scanner)

-트러블 슈팅

1단계
 MenuNumber = Menu.nextInt();를 do while 내부에서 실행시켜 무한 루프에 빠지는 문제점이 발생해 고쳤다

2단계
계속menuItems.get(i).MenuInformation() 이 부분에서 오류가 생겼다.
처음에는 menuItems.MenuInformation().get()이렇게 코드를 작성하였다가
나중에야 일단 인스턴스화 한 내용의 get함수를 가지고 와서  MenuInformation()함수를 호출해야 출력한다는 것을 깨달아 고치게되었다.

또한 이렇게 코드를 짜면 생성자 하나하나 만들어 줘야 하는 문제점이 생겨 아래와 같이 코드를 수정했다.
MenuItem menuitems = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
menuItems.add(menuitems);

=> menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거”); 


3단계 
원래 짜던 코드 그대로 do while을 적용시켜 보았지만 0을 누르고 나서 뒤로가는 버튼을 따로 만들기가 너무 힘들었다.
그래서 생각해놓은게 따로 함수명을 만들어 0을 누를 때 값이 비어있지 않으면 뒤로가는 기능을 만들면 되지않을까? 라는 생각을 하게되었고
값을 입력받고 menuNumber >= 1 && menuNumber <= menuItems.size() 이 조건을 만족할 시 값을 다시 메뉴를 출력하게 만들어주었다.


4단계
버거나 음료 카테고리를 만들고 menuItems에 결국에 담는 과정이었는데 public void addMenuItem(MenuItem menuItem) {
    this.menuItems.add(menuItem); // 새로운 메뉴 항목을 menuItems 리스트에 추가하는 과정
    을 구현하는 과정에서 문제가 많이 발생하였지만 결국에는 버거 메뉴 항목을 리스트에 추가하는것은 같다라고 생각을 하니 수월하게 문제가 해결되었다.

5단계
3,4단계에서 있던내용에 Getter와 Setter 메서드만 사용하면 되어 문제가 생기지 않았다.
