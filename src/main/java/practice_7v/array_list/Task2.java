package practice_7v.array_list;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private ArrayList<Integer> list2;
    //конструктор класса
    public Task2(){
        this.list2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

    }
    //метод добавления числа в конец списка
    public void addNumber(Integer num){
        list2.add(num);

    }
    //метод для вывода списка с четными числами
    public ArrayList<Integer> evenNum(){
        ArrayList<Integer> listEven = new ArrayList<>();
        list2.forEach(i->{
            if(i%2 == 0){
                listEven.add(i);
            }
        });
        return listEven;
    }
}
