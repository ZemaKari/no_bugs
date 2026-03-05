package practice_7v.linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task4 {
    private LinkedList<Integer> linkedList4;
    // конструктор класса

    public Task4(){
        this.linkedList4 = new LinkedList<>(List.of(4,5,6,9));

    }
    //метод суммы
    public Integer sunSolver(){
        AtomicInteger summa = new AtomicInteger();
        linkedList4.forEach(i -> {
            summa.addAndGet(i);
        });
        return summa.get();
    }
}













