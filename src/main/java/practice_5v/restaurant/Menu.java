package practice_5v.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public Menu(){
        this.dishes  = new ArrayList<>();

    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }
    public void printMenu(){
        System.out.println("В меню есть: " + this.dishes);
    }

    public void printInfoDishes(Dish dish){
        dish.getDiscription();
    }
}
