package practice_9v.function_interface;

import java.util.function.Consumer;

public class MainForLambdaWithConsumer {
    // Напишите лямбду, которая принимает строку и печатает её в консоль.
    public static void main(String[] args) {
        Consumer<String> printConsile = str-> System.out.println(str);
        printConsile.accept("Веселая компания!");
    }
}
