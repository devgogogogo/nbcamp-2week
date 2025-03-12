package essential_task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //DB 대신 하용하는 곳이라고 생각하면 된다.
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(dataSet());
        kiosk.start();
    }

    public static List<Menu> dataSet() {
        List<MenuItem> burgerItems = new ArrayList<>(); // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        burgerItems.add(new MenuItem("ShackBurger",6900,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack",8900,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger",6900,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger",5400,"비프패티를 기반으로 야채가 들어간 기본버거"));
        Menu burgersmenu = new Menu("Burgers",burgerItems); // Menu 객체 생성하면서 카테고리 이름 설정

        List<MenuItem> drinkItems = new ArrayList<>();// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        drinkItems.add(new MenuItem("Coke", 2000, "콜라"));
        drinkItems.add(new MenuItem("Coffee", 3000, "커피"));
        drinkItems.add(new MenuItem("OrangeJuice", 4000, "오렌지주스"));
        drinkItems.add(new MenuItem("Milk", 3500, "우유"));
        Menu drinksmenu = new Menu("Drinks",drinkItems);// Menu 객체 생성하면서 카테고리 이름 설정

        List<MenuItem> dessertItems = new ArrayList<>();// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        dessertItems.add(new MenuItem("Cake", 4000, "달달한 케이크"));
        dessertItems.add(new MenuItem("마카롱", 3000, "달짝지근한 마카롱"));
        dessertItems.add(new MenuItem("쿠키", 3500, "겉바속촉 쿠키"));
        dessertItems.add(new MenuItem("타르트", 4500, "영양만점 타르트"));
        Menu dessertmenu = new Menu("Desserts",dessertItems);// Menu 객체 생성하면서 카테고리 이름 설정

        List<Menu> menuCategory = new ArrayList<>();
        menuCategory.add(burgersmenu);
        menuCategory.add(drinksmenu);
        menuCategory.add(dessertmenu);
        return menuCategory;
    }
}