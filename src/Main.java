import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성하면서 카테고리 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입

        // Menu menu = new Menu();

        Kiosk kiosk = new Kiosk();// Kiosk 객체 생성

        kiosk.start();// Kiosk 내 시작하는 함수 호출
    }
}