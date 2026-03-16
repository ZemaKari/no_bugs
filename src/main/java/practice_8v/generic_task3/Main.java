package practice_8v.generic_task3;

import practice_8.generics_3.Pair;

public class Main {
    public static void main(String[] args) {
        Pair< String, Integer> element = new Pair<>("string", 2);
        System.out.println(element.getElementTwo());
        System.out.println(element.getElementOne());
        Peir<OneMoreClass, Integer> element1 = new Peir<>(new OneMoreClass(456), 9);
        System.out.println(element1.getElementOne());
        System.out.println(element1.getElementTwo());

    }
}
