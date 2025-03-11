package essential_task;

import java.util.List;

public class Menu {
    private String name; // 카테고리 이름 필드 추가 (O)
    private List<MenuItem> menuItems; // essential_task.MenuItem 클래스를 List로 관리 (O)

    public Menu(String name, List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    /*
    * List를 리턴하는 함수 (O) -->> getter는 구현했지만 활용하진 못했음
    * 대신 밑에 있는 public void printMenus(List<essential_task.MenuItem> menuItems, String menu) 통해 구현하였음
    */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // List에 포함된 MenuItem을 순차적으로 보여주는 함수 (O)
    public void printMenus(List<MenuItem> menuItems, String menu) {
        System.out.println("[ " + this.name  + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ", " + menuItems.get(i).getName() + "  | w " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDescription());
        }
        System.out.println("0.뒤로가기");
    }
}
