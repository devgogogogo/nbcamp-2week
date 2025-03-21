package challenge_task;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Burger burgerMenu = new Burger();
        Menu menu1 = burgerMenu.addBurgerMenu();

        Drink drinkMenu = new Drink();
        Menu menu2 = drinkMenu.addDrink();

        Dessert dessertMenu = new Dessert();
        Menu menu3 = dessertMenu.addDessert();

        List<Menu> menuCategory = new ArrayList<>();
        menuCategory.add(menu1);
        menuCategory.add(menu2);
        menuCategory.add(menu3);

        Kiosk kiosk = new Kiosk(menuCategory);
        kiosk.start();

    }
}