package practice_7v.array_dequeue;

import practice_7.array_dequeue.Task2;

public class Main {
    public static void main(String[] args) {
//        //задача2: Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
//        Task2 queue2 = new Task2();
//        queue2.addElement("первый");
//        queue2.addElement("Второй");
//        queue2.addElement("Третий");
//        queue2.getElement();
        //задача3: Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
        Task3 queue3 = new Task3();
        queue3.addStart("первый1");
        queue3.addStart("первый2");
        queue3.addEnd("последний1");
        queue3.addEnd("последний2");
        queue3.printLastElement();
        queue3.printFirstElement();
    }
}
