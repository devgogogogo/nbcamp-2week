package essential_task;

public class Main {
    public static void main(String[] args) {
        // essential_task.Menu 객체 생성하면서 카테고리 이름 설정
        // essential_task.Menu 클래스 내 있는 List<essential_task.MenuItem> 에 essential_task.MenuItem 객체 생성하면서 삽입

        // essential_task.Menu menu = new essential_task.Menu();

        Kiosk kiosk = new Kiosk();// essential_task.Kiosk 객체 생성

        kiosk.start();// essential_task.Kiosk 내 시작하는 함수 호출
    }
}