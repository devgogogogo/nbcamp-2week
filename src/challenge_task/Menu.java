package challenge_task;

import java.util.List;

public class Menu {
    private String name;
    private List<MenuItem> menuItems;

    public Menu(String name, List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    // Kiosk 클래스에 아이템리스트를 출력하기 위한 리턴하는 함수
    public String getName() {
        return name;
    }

    // Kiosk 클래스에 아이템리스트를 출력하기 위한 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // List에 포함된 MenuItem을 순차적으로 보여주는 함수
    public void printMenu() {
        System.out.println("[" + name + " MENU] " );
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i +1) +". " + menuItems.get(i).getName() + " | " +menuItems.get(i).getPrice() + " W | " + menuItems.get(i).getDescription());
        }
        System.out.println("0. 뒤로가기");
    }
}
