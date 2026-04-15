package practice_9v.function_interface;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (x,y)->x+y;
        MathOperation subtract=(x,y)->x-y;
        MathOperation multiply=(x,y)->x*y;
        MathOperation divide=(x,y)->x/y;

        System.out.println(add.apply(5,5));
        System.out.println(subtract.apply(10,6));
        System.out.println(multiply.apply(3,9));
        System.out.println(divide.apply(9,3));
    }
}
