package challenge_task;
import java.util.ArrayList;
import java.util.List;
public class Dessert {
    public Menu addDessert() {
        List<MenuItem> dessertItems = new ArrayList<MenuItem>();
        dessertItems.add(new MenuItem("Cake", 4000, "달달한 케이크"));
        dessertItems.add(new MenuItem("마카롱", 3000, "달짝지근한 마카롱"));
        dessertItems.add(new MenuItem("쿠키", 3500, "겉바속촉 쿠키"));
        dessertItems.add(new MenuItem("타르트", 4500, "영양만점 타르트"));
        Menu dessertMenu = new Menu("Desserts", dessertItems);
        return dessertMenu;
    }
}
