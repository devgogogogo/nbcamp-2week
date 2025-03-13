package challenge_task;

import java.util.ArrayList;
import java.util.List;
public class Drink {
    public Menu addDrink() {
        List<MenuItem> drinkItems = new ArrayList<>();// Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        drinkItems.add(new MenuItem("Coke", 2000, "콜라"));
        drinkItems.add(new MenuItem("Coffee", 3000, "커피"));
        drinkItems.add(new MenuItem("OrangeJuice", 4000, "오렌지주스"));
        drinkItems.add(new MenuItem("Milk", 3500, "우유"));
        Menu drinkMenu = new Menu("Drinks", drinkItems);
        return drinkMenu;
    }
}
