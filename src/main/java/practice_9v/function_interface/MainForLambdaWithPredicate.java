package practice_9v.function_interface;

import java.util.function.Predicate;

public class MainForLambdaWithPredicate {
    //Напишите лямбду, которая проверяет, является ли число чётным.
    public static void main(String[] args) {
        Predicate<Integer> isEven = n->n%2==0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(15));
        System.out.println(isEven.test(6));

    }
}
