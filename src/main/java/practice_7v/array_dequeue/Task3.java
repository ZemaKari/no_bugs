package practice_7v.array_dequeue;

import java.util.ArrayDeque;

public class Task3 {
    private ArrayDeque<String> arrayDeque3;

    public Task3(){
        this.arrayDeque3 = new ArrayDeque<>();
    }

    public void addStart(String element){
        arrayDeque3.addFirst(element);

    }
    public void addEnd(String element){
        arrayDeque3.addLast(element);

    }
    public void printFirstElement(){
        System.out.println(arrayDeque3.removeFirst());
    }

    public void printLastElement(){
        System.out.println(arrayDeque3.removeLast());
    }
}
