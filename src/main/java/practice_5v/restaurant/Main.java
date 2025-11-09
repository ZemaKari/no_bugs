package practice_5v.restaurant;

public class Main {
    public static void main(String[] args) {
        Dish soup = new HotDish("Борщ", 40);
        Dish drink = new Drink("Чай", 350);
        Menu menu= new Menu();
        menu.printMenu();
        menu.addDish(soup);
        menu.addDish(drink);
        menu.printMenu();
        menu.printInfoDishes(soup);
        menu.printInfoDishes(drink);

    }

}
