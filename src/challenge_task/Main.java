package challenge_task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //DB 대신 하용하는 곳이라고 생각하면 된다.
    public static void main(String[] args) {

        Burger burgerMenu = new Burger();
        Menu menu1 = burgerMenu.addBurgerMenu();

        Drink drinkMenu = new Drink();
        Menu menu2 = drinkMenu.addDrink();



        List<MenuItem> dessertItems = new ArrayList<>();// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        dessertItems.add(new MenuItem("Cake", 4000, "달달한 케이크"));
        dessertItems.add(new MenuItem("마카롱", 3000, "달짝지근한 마카롱"));
        dessertItems.add(new MenuItem("쿠키", 3500, "겉바속촉 쿠키"));
        dessertItems.add(new MenuItem("타르트", 4500, "영양만점 타르트"));
        Menu dessertmenu = new Menu("Desserts", dessertItems);// Menu 객체 생성하면서 카테고리 이름 설정

        List<Menu> menuCategory = new ArrayList<>();
        menuCategory.add(menu1);
        menuCategory.add(menu2);
        menuCategory.add(dessertmenu);

        Kiosk kiosk = new Kiosk(menuCategory);
        kiosk.start();

    }
}