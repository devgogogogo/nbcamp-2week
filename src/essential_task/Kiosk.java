package essential_task;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<Menu> menuCategory;

    public Kiosk(List<Menu> menuCategory) {
        this.menuCategory = menuCategory;
    }

    // 흐름을 제어하는 메서드
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //Main MENU 출력 메서드를 사용하지 않고 그냥 for으로 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menuCategory.size(); i++) {
                System.out.println((i +1) +". " +  menuCategory.get(i).getName());
            }
            System.out.println("0.종료");

            //카테고리에 있는 번호 입력
            int num1 = sc.nextInt();
            sc.nextLine();
            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            // else- if 문을 여러개 안쓰는 이유 --> 나중에 메뉴들이 늘어났을때 2개의 클래스를 작업해야 하는 상황이
            // 발생되 작업효율이 떨어진다.
            // Menu 클래스에 만들어 놓은 함수를 통해 MenuItems를 출력
            Menu menu = menuCategory.get(num1 - 1); //0
            menu.printMenu();
            int num2 = sc.nextInt();

            if (num2 == 0) {
                continue;
            }

            // 첫번째 선택한 메뉴의 아이템리스트 출력
            String choiceName = menu.getMenuItems().get(num2 - 1).getName();
            Integer choicePrice = menu.getMenuItems().get(num2 - 1).getPrice();
            String choiceDescription = menu.getMenuItems().get(num2 - 1).getDescription();
            System.out.println("선택한 메뉴 : "+ choiceName + " | " + choicePrice + " W | " + choiceDescription);
        }
    }
}
