package practice_7v.array_list;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private ArrayList<Integer> list1;

    public Task1(){
        this.list1 = new ArrayList<>((List.of(1,2,3,4,5)));

    }
    //метод добавляет число в конец массива
    public void addNum(int number){
        list1.add(number);
    }
    // метод распечатывает элементы списка
    public void printList(){
        list1.forEach(System.out::println);
        System.out.println();
    }
}
