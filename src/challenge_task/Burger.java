package challenge_task;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    public Menu addBurgerMenu() {
        List<MenuItem> burgerItems = new ArrayList<>(); // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        burgerItems.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));
        Menu burgerMenu = new Menu("Burgers", burgerItems);
        return burgerMenu;
    }
}
