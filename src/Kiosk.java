import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.

    Scanner sc = new Scanner(System.in); // 스캐너 선언(O)
    public void start() {
        List<MenuItem> burgerItems = new ArrayList<>();
        burgerItems.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 8900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 5900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Menu menu1 = new Menu("BURGERS", new ArrayList<>());

        List<MenuItem> drinkItems = new ArrayList<>();
        drinkItems.add(new MenuItem("Coke", 2000, "콜라"));
        drinkItems.add(new MenuItem("Coffee", 3000, "커피"));
        drinkItems.add(new MenuItem("OrangeJuice", 4000, "오렌지주스"));
        drinkItems.add(new MenuItem("Milk", 3500, "우유"));
        Menu menu2 = new Menu("DRINKS", drinkItems);

        List<MenuItem> dessertItems = new ArrayList<>();
        dessertItems.add(new MenuItem("Cake", 4000, "달달한 케이크"));
        dessertItems.add(new MenuItem("마카롱", 3000, "달짝지근한 마카롱"));
        dessertItems.add(new MenuItem("쿠키", 3500, "겉바속촉 쿠키"));
        dessertItems.add(new MenuItem("타르트", 4500, "영양만점 타르트"));
        Menu menu3 = new Menu("DESSERTS",dessertItems);

        List<Menu> menus = new ArrayList<>();
        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);

        while (true) { // 반복문 시작(O)
            // TODO 메인메뉴 출력
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력 (O)
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println(i +1 +". " + menus.get(i).getName());
            }
            System.out.println("0. 종료");
            //TODO 입력부분
            int num1 = sc.nextInt(); // 숫자 입력 받기 (O)
            sc.nextLine();

            if (num1 == 1) { // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                //TODO 버거종류 출력
                menu1.printMenus(burgerItems, menu1.getName());
                int num1_1 = sc.nextInt();
                sc.nextLine();// 숫자 입력 받기
                /* Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
                 -->> 이부분은 Menu 클래스에 메서드로 활용하였음 */
                //TODO 선택한 버거 출력

                // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
                if (num1_1 == 1) {
                    System.out.println("선택한 메뉴: "  + burgerItems.get(0).getName() + " | w "+ burgerItems.get(0).getPrice() + " | " +burgerItems.get(0).getDescription() );
                } else if (num1_1 == 2) {
                    System.out.println("선택한 메뉴: "  + burgerItems.get(1).getName() + " | w "+ burgerItems.get(1).getPrice() + " | " +burgerItems.get(1).getDescription() );
                } else if (num1_1 == 3) {
                    System.out.println("선택한 메뉴: "  + burgerItems.get(2).getName() + " | w "+ burgerItems.get(2).getPrice() + " | " +burgerItems.get(2).getDescription() );
                }else if (num1_1 == 4) {
                    System.out.println("선택한 메뉴: "  + burgerItems.get(3).getName() + " | w "+ burgerItems.get(3).getPrice() + " | " +burgerItems.get(3).getDescription() );
                }
                //TODO 드링크 종류 출력
            } else if (num1 == 2) {
                menu2.printMenus(drinkItems,menu2.getName());
                int num1_2 = sc.nextInt();

                //TODO 선택한 드링크메뉴 출력
                if (num1_2 == 1) {
                    System.out.println("선택한 메뉴: "  + drinkItems.get(0).getName() + " | w "+ drinkItems.get(0).getPrice() + " | " +drinkItems.get(0).getDescription());
                } else if (num1_2==2) {
                    System.out.println("선택한 메뉴: "  + drinkItems.get(1).getName() + " | w "+ drinkItems.get(1).getPrice() + " | " +drinkItems.get(1).getDescription());
                } else if (num1_2 == 3) {
                    System.out.println("선택한 메뉴: "  + drinkItems.get(2).getName() + " | w "+ drinkItems.get(2).getPrice() + " | " +drinkItems.get(2).getDescription());
                } else if (num1_2 == 4) {
                    System.out.println("선택한 메뉴: "  + drinkItems.get(3).getName() + " | w "+ drinkItems.get(3).getPrice() + " | " +drinkItems.get(3).getDescription());
                }
            }else if (num1 == 3) {
                //TODO 디저트 종류 출력
                menu3.printMenus(dessertItems,menu3.getName());
                int num1_3 = sc.nextInt();
                //TODO 선택한 디저트 출력
                if (num1_3 == 1) {
                    System.out.println("선택한 메뉴: "  + dessertItems.get(3).getName() + " | w "+ dessertItems.get(3).getPrice() + " | " +dessertItems.get(3).getDescription());
                } else if (num1_3 == 2) {
                    System.out.println("선택한 메뉴: "  + dessertItems.get(3).getName() + " | w "+ dessertItems.get(3).getPrice() + " | " +dessertItems.get(3).getDescription());
                } else if (num1_3 == 3) {
                    System.out.println("선택한 메뉴: "  + dessertItems.get(3).getName() + " | w "+ dessertItems.get(3).getPrice() + " | " +dessertItems.get(3).getDescription());
                } else if (num1_3 == 4) {
                    System.out.println("선택한 메뉴: "  + dessertItems.get(3).getName() + " | w "+ dessertItems.get(3).getPrice() + " | " +dessertItems.get(3).getDescription());
                }
            } else if (num1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
