package practice_7v.linked_list;

import java.util.LinkedList;

public class Task2 {
    private LinkedList<String> linkedList2;
    //конструктор
    public Task2(){
        this.linkedList2 = new LinkedList<>();

    }
    //метод по добавлению задач в конец
    public void addTask(String newTask){
        linkedList2.add(newTask);
    }
    //метод для обраьотки задач
    public void taskManager(){
        String task = new String();
        while (!linkedList2.isEmpty()){
            task = linkedList2.poll();
            System.out.println(task);

        }
    }
}
