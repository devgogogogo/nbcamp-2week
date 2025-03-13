package challenge_task;

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
            // TODO 장바구니에 담는 기능 구현해야함

            int num3 = sc.nextInt();
            // 장바구니 담는 출력

            System.out.println(choiceName + " 이(가) 장바구니에 추가되었습니다.");
//            - [ ]  **장바구니 생성 및 관리 기능**
//            - [ ]  사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능을 제공합니다.
//                    - [ ]  장바구니는 메뉴명, 수량, 가격 정보를 저장하며, 항목을 동적으로 추가 및 조회할 수 있어야 합니다.
//                    - [ ]  사용자가 잘못된 선택을 했을 경우 예외를 처리합니다(예: 유효하지 않은 메뉴 번호 입력)
//            - [ ]  **장바구니 출력 및 금액 계산**
//            - [ ]  사용자가 결제를 시도하기 전에, 장바구니에 담긴 모든 메뉴와 총 금액을 출력합니다.
//            - [ ]  출력 예시
//            - [ ]  각 메뉴의 이름, 가격, 수량
//                    - [ ]  총 금액 합계
//                    - [ ]  **장바구니 담기 기능**
//            - [ ]  메뉴를 클릭하면 장바구니에 추가할 지 물어보고, 입력값에 따라 “추가”, “취소” 처리합니다.
//                    - [ ]  메뉴는 한 번에 1개만 담을 수 있습니다.
//            - [ ]  장바구니에 담은 목록을 출력합니다.
//            - [ ]  **주문 기능**
//            - [ ]  장바구니에 담긴 모든 항목을 출력합니다.
//                    - [ ]  합산하여 총 금액을 계산하고, “주문하기”를 누르면 장바구니를 초기화합니다.
        }
    }
}
